package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.CategorieProduit;
import com.gestion_magasin.gestion_magasin_stock.repository.CategorieProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieProduitImp implements ICategorieProduitService{

    CategorieProduitRepository categorieProduitRepository;
    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categorieProduitRepository.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepository.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepository.save(cp);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categorieProduitRepository.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Long id) {
        categorieProduitRepository.deleteById(id);

    }
}
