package com.gestion_magasin.gestion_magasin_stock.repository;

import com.gestion_magasin.gestion_magasin_stock.entities.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieProduitRepository extends JpaRepository<CategorieProduit,Long> {
}
