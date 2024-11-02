package com.example.Arcana.data;

import com.example.Arcana.entity.Spell;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface SpellRepository extends JpaRepository<Spell,Long> {

}
