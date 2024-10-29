package com.example.Arcana.data;

import com.example.Arcana.entity.Spell;
import org.springframework.data.jpa.repository.*;

public interface SpellRepository extends JpaRepository<Spell,Long> {
}
