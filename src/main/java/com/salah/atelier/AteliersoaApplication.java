package com.salah.atelier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.salah.atelier.entities.Offre;
import com.salah.atelier.repos.OffreRepository;

@SpringBootApplication
public class AteliersoaApplication implements CommandLineRunner {

    @Autowired
    OffreRepository offreRepository;

    public static void main(String[] args) {
        SpringApplication.run(AteliersoaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        offreRepository.save(new Offre("Web Design", "informatique", "AXA", 2, "France"));
        offreRepository.save(new Offre("Developpeur", "informatique", "Talys", 3, "Tunisie"));
        offreRepository.save(new Offre("Architecte", "informatique", "SIS", 2, "Allemagne"));

        System.out.println("Offres ajoutées avec succès !");
    }
}
