package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.Operateur;

import java.util.List;

public interface IOperateurService {

    List<Operateur> retrieveAllOperateurs();

    Operateur addOperateur (Operateur o);

    Operateur updateOperateur (Operateur o);

    Operateur retrieveOperateur (Long id);

    void removeOperateur (Long id);

    public void assignOperateurToFacture(Long idOperateur, Long idFacture);


}
