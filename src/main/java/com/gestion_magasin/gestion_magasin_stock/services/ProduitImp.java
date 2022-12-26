package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.Produit;
import com.gestion_magasin.gestion_magasin_stock.entities.Stock;
import com.gestion_magasin.gestion_magasin_stock.repository.ProduitRepository;
import com.gestion_magasin.gestion_magasin_stock.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitImp implements IProduitService{

    ProduitRepository produitRepository;
    StockRepository stockRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    //a detailler
    @Override
    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {
        return null;
    }

    //a detailler
    @Override
    public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
        return null;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        produit.setStock(stock);
        produitRepository.save(produit);
    }


}
