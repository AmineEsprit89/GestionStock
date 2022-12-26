package com.gestion_magasin.gestion_magasin_stock.services;


import com.gestion_magasin.gestion_magasin_stock.entities.Fournisseur;
import com.gestion_magasin.gestion_magasin_stock.entities.SecteurActivite;
import com.gestion_magasin.gestion_magasin_stock.repository.FournisseurRepository;
import com.gestion_magasin.gestion_magasin_stock.repository.SecteurActiviteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FournisseurImp implements IFournisseurService{

    FournisseurRepository fournisseurRepository;
   SecteurActiviteRepository secteurActiviteRepository;
    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        SecteurActivite secteurActivite = secteurActiviteRepository.findById(secteurActiviteId).orElse(null);
        fournisseur.getSecteurActivites().add(secteurActivite);
        fournisseurRepository.save(fournisseur);


    }
}
