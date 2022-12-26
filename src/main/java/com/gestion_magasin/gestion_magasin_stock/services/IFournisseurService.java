package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.Fournisseur;

import java.util.List;

public interface IFournisseurService {

    List<Fournisseur> retrieveAllFournisseurs();
    Fournisseur addFournisseur (Fournisseur f);
    Fournisseur updateFournisseur (Fournisseur f);
    Fournisseur retrieveFournisseur (Long id);

    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long
            secteurActiviteId) ;
}
