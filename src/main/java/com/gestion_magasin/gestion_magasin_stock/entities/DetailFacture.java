package com.gestion_magasin.gestion_magasin_stock.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DetailFacture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDetailFacture;

    Integer quantiteCommandee;

    Float prixTotalDetail;

    Integer pourcentageRemise;

    Float montantRemise;


    @ManyToOne
    Facture facture;

    @ManyToOne
    Produit produit;


}
