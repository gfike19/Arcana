package com.example.Arcana.service;

import com.example.Arcana.data.*;
import com.example.Arcana.entity.Spell;
import com.fasterxml.jackson.databind.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.*;

@Service
public class SpellService {

    @Autowired
    SpellRepository spellRepository;

    @Autowired
    ObjectMapper objectMapper;

    public SpellService(SpellRepository spellRepository, ObjectMapper objectMapper) {
        this.spellRepository = spellRepository;
        this.objectMapper = objectMapper;
    }

    public String importAllSpells() {
        RestTemplate restTemplate = new RestTemplate();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("spell_indexes.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            StringBuilder response = new StringBuilder();
            String spellName;
            while ((spellName = reader.readLine()) != null) {
                String url = "https://www.dnd5eapi.co/api/spells/" + spellName;
                // Retrieve JSON from API
                String spellJson = restTemplate.getForObject(url, String.class);
                // Map JSON to Spell object
                Spell spell = mapJsonToSpell(objectMapper.readTree(spellJson));
                spellRepository.save(spell);
                response.append(spellName).append(" has been added!\n");
            }
            response.append("All spells successfully loaded!");
            return response.toString();
        } catch (IOException e) {
            return e.toString();
        }


    }

    private Spell mapJsonToSpell(JsonNode jsonNode) {
        Spell spell = new Spell();
        spell.setName(jsonNode.get("name").asText());
        spell.setLevel(jsonNode.get("level").asInt());

        // Convert description list to a single string
        if (jsonNode.has("desc")) {
            StringBuilder descriptionBuilder = new StringBuilder();
            jsonNode.get("desc").forEach(node -> descriptionBuilder.append(node.asText()).append(" "));
            spell.setDescription(descriptionBuilder.toString().trim());
        }

        // Convert higher_level list to a single string
        if (jsonNode.has("higher_level")) {
            StringBuilder higherLevelBuilder = new StringBuilder();
            jsonNode.get("higher_level").forEach(node -> higherLevelBuilder.append(node.asText()).append(" "));
            spell.setHigherLevel(higherLevelBuilder.toString().trim());
        }

        spell.setRange(jsonNode.get("range").asText());

        // Convert components list to a single string
        if (jsonNode.has("components")) {
            StringBuilder componentsBuilder = new StringBuilder();
            jsonNode.get("components").forEach(node -> componentsBuilder.append(node.asText()).append(", "));
            spell.setComponents(componentsBuilder.toString().replaceAll(", $", ""));
        }

//        spell.setMaterial(jsonNode.has("material") ? jsonNode.get("material").asText() : null);
        spell.setDuration(jsonNode.get("duration").asText());
        spell.setConcentration(jsonNode.get("concentration").asBoolean());
        spell.setCastingTime(jsonNode.get("casting_time").asText());

        // Extract damage type
        if (jsonNode.has("damage") && jsonNode.get("damage").has("damage_type")) {
            spell.setDamageType(jsonNode.get("damage").get("damage_type").get("name").asText());
        }

        // Extract damage at slot level as a formatted string
        if (jsonNode.has("damage") && jsonNode.get("damage").has("damage_at_slot_level")) {
            JsonNode damageAtSlotLevelNode = jsonNode.get("damage").get("damage_at_slot_level");
            StringBuilder damageAtSlotLevel = new StringBuilder();
            Iterator<String> fieldNames = damageAtSlotLevelNode.fieldNames();
            while (fieldNames.hasNext()) {
                String level = fieldNames.next();
                damageAtSlotLevel.append("Level ").append(level).append(": ").append(damageAtSlotLevelNode.get(level).asText()).append("; ");
            }
            spell.setDamageAtSlotLevel(damageAtSlotLevel.toString().trim());
        }

        // Set school
        if (jsonNode.has("school")) {
            spell.setSchool(jsonNode.get("school").get("name").asText());
        }

        return spell;
    }
}
