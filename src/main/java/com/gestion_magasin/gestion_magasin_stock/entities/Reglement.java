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


public class Reglement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;
    Float montantPaye;
    Float montantRestant;
    Boolean payee;
    Date dateReglement;


@ManyToOne
    Facture facture;


}
