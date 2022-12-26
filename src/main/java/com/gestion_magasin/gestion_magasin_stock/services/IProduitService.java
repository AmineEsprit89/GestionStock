package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.Produit;

import java.util.List;

public interface IProduitService {
    List<Produit> retrieveAllProduits();

    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);

}
