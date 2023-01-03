package com.gestion_magasin.gestion_magasin_stock.repository;

import com.gestion_magasin.gestion_magasin_stock.entities.Facture;
import com.gestion_magasin.gestion_magasin_stock.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {

    List<Facture> findByFournisseurIdFournisseur(Long idFournisseur);


    //jpql
    //@Query("select f from Facture f where f.fournisseur.idFournisseur =?1")
    // List <Factures> retrieveFactureByFournisseur(idFournisseur)


}
