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
public class SecteurActivite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idSecteurActivite;

    String codeSecteurActivite;

    String libelleSecteurActivite;


    @ManyToMany(mappedBy = "secteurActivites")
    Set < Fournisseur > fournisseurs;

}
