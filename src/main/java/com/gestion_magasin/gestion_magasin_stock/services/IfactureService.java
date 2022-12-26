package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.Facture;

import java.util.List;

public interface IfactureService {

    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);

    List<Facture> getFacturesByFournisseur(Long idFournisseur);

}
