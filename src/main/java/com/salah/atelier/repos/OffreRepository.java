package com.salah.atelier.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.salah.atelier.entities.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> {
   
}