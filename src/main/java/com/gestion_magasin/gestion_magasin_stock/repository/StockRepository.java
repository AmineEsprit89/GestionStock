package com.gestion_magasin.gestion_magasin_stock.repository;

import com.gestion_magasin.gestion_magasin_stock.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock,Long> {

}
