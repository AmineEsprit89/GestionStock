package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.SecteurActivite;

import java.util.List;

public interface ISecteurActiviteService {
    List<SecteurActivite> retrieveAllSecteurActivites();

    SecteurActivite addSecteurActivite (SecteurActivite sa);

    SecteurActivite updateSecteurActivite (SecteurActivite sa);

    SecteurActivite retrieveSecteurActivite (Long id);

    void removeSecteurActivite (Long id);
}
