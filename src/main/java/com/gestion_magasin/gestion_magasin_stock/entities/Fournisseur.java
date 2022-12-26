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
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFournisseur;

    String codeFournisseur;

    String libelleFournisseur;

    CategorieFournisseur categorieFournisseur;

    @OneToMany(mappedBy = "fournisseur")
    Set < Facture> factures;

    @OneToOne(cascade = CascadeType.ALL)
    DetailFournisseur detailFournisseur;

    @ManyToMany
    Set < SecteurActivite> secteurActivites;

}
