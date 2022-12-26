package com.gestion_magasin.gestion_magasin_stock.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DetailFournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDetailFournisseur;

    Date dateDebutCollaboration;

    String adresse;

    String matricule;

    @OneToOne(mappedBy = "detailFournisseur")
    Fournisseur fournisseur;

}
