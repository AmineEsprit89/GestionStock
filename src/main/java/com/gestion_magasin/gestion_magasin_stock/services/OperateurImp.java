package com.gestion_magasin.gestion_magasin_stock.services;


import com.gestion_magasin.gestion_magasin_stock.entities.Facture;
import com.gestion_magasin.gestion_magasin_stock.entities.Operateur;
import com.gestion_magasin.gestion_magasin_stock.repository.FactureRepository;
import com.gestion_magasin.gestion_magasin_stock.repository.OperateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class OperateurImp implements IOperateurService {

    OperateurRepository operateurRepository;
    FactureRepository factureRepository;
    @Override
    public List<Operateur> retrieveAllOperateurs() {
        return operateurRepository.findAll();
    }

    @Override
    public Operateur addOperateur(Operateur o) {
        return operateurRepository.save(o);
    }

    @Override
    public Operateur updateOperateur(Operateur o) {
        return operateurRepository.save(o);
    }

    @Override
    public Operateur retrieveOperateur(Long id) {
        return operateurRepository.findById(id).orElse(null);
    }

    @Override
    public void removeOperateur(Long id) {
        operateurRepository.deleteById(id);
    }

    @Override
    public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
        Operateur operateur = operateurRepository.findById(idOperateur).orElse(null);
        Facture facture = factureRepository.findById(idFacture).orElse(null);
        operateur.getFactures().add(facture);
        operateurRepository.save(operateur);
    }
}
