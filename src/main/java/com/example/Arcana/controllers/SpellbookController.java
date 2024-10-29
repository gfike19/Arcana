package com.example.Arcana.controllers;

import com.example.Arcana.entity.Spell;
import com.example.Arcana.service.SpellService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/spellbook")
public class SpellbookController {

    @Autowired
    SpellService spellService;

    @GetMapping
    public String getSpellbook() {
        return "Spellbook";
    }

    @GetMapping("/loadAllSpells")
    public String loadAllspells () {
        return spellService.importAllSpells();
    }

    @GetMapping("/favicon.ico")
    @ResponseBody
    void handleFavicon() {
        // No-op or provide an icon response if needed
    }
}
