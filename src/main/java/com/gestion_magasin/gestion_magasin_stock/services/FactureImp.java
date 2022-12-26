package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.Facture;
import com.gestion_magasin.gestion_magasin_stock.repository.FactureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FactureImp implements IfactureService{

    FactureRepository factureRepository;
    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        factureRepository.deleteById(id);

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByFournisseur(Long idFournisseur) {
        return factureRepository.findByFournisseurIdFournisseur(idFournisseur);
    }
}
