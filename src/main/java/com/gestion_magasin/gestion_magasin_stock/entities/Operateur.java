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
public class Operateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idOperateur;

    String nom;

    String prenom;

    String password;

@OneToMany
    Set < Facture > factures;



}
