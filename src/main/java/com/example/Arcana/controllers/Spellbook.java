package com.example.Arcana.controllers;

import com.example.Arcana.entity.Spell;
import com.example.Arcana.service.SpellService;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spellbook")
public class Spellbook {

    private final SpellService spellService;

    public Spellbook(SpellService spellService) {
        this.spellService = spellService;
    }

    // Endpoint to fetch a spell by name and add it to the list
    @GetMapping("/{name}")
    public Spell getSpellByName(@PathVariable String name) {
        return spellService.fetchSpellByName(name);
    }

    // Endpoint to return the list of all fetched spells
    // NOT FOR WORKING WITH ANGULAR
//    @GetMapping
//    public List<Spell> getAllSpells() {
//        return spellService.getAllSpells();
//    }

    public String getSpells(Model model) {
        List<Spell> spells = spellService.getAllSpells();
        model.addAttribute("spells", spells);
        return "spellbook";
    }
}
