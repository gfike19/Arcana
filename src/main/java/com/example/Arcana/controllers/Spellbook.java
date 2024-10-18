package com.example.Arcana.controllers;

import com.example.Arcana.entity.Spell;
import com.example.Arcana.service.SpellService;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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
    @GetMapping
    public List<Spell> getAllSpells() {
        return spellService.getAllSpells();
    }
}
