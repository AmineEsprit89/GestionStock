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
public class Facture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idFacture;

    Float montantRemise;

    Float montantFacture;

    Date dateCreationFacture;

    Date dateDerniereModification;

    Boolean archivee;
//spring doc mvm repo ajouter dans pom.xml
@OneToMany(mappedBy = "facture")
    Set <Reglement> reglements;

@OneToMany(mappedBy = "facture")
    Set <DetailFacture> detailFactures;

@ManyToOne
    Fournisseur fournisseur;
}
