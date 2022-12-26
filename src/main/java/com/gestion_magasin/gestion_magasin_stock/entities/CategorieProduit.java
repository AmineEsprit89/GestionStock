package com.gestion_magasin.gestion_magasin_stock.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CategorieProduit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCategorieProduit;

    String codeProduit;

    String libelleCategorieProduit;


    @OneToMany(mappedBy = "categorieProduit")
    Set <Produit > produits;



}
