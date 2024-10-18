package com.example.Arcana.service;

import com.example.Arcana.entity.Spell;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpellService {

    private final RestTemplate restTemplate;

    // Initialize an empty list to hold fetched spells
    private final List<Spell> spellList = new ArrayList<>();

    // The base URL for the external DnD API
    private final String apiUrl = "https://www.dnd5eapi.co/api/spells/";

    public SpellService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Method to fetch a spell by its name from the API
    public Spell fetchSpellByName(String spellName) {
        String url = apiUrl + spellName.toLowerCase().replace(" ", "-");  // Convert spell name to API format
        Spell spell = restTemplate.getForObject(url, Spell.class);  // Make the GET request
        if (spell != null) {
            spellList.add(spell);  // Add the fetched spell to the list
        }
        return spell;
    }

    // Method to return all spells fetched so far
    public List<Spell> getAllSpells() {
        return spellList;
    }
}
