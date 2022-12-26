package com.gestion_magasin.gestion_magasin_stock.repository;

import com.gestion_magasin.gestion_magasin_stock.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
