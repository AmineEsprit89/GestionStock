package com.gestion_magasin.gestion_magasin_stock.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProduit;

    String codeProduit;
    String libelleProduit;

    Float prix;

    Date dateCreation;

    Date dateDerniereModification;

    @OneToMany(mappedBy = "produit")
    Set < DetailFacture> detailFactures;


    @ManyToOne
    Stock stock;

    @ManyToOne
    CategorieProduit categorieProduit;


}
