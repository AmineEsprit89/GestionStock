package com.gestion_magasin.gestion_magasin_stock.services;

import com.gestion_magasin.gestion_magasin_stock.entities.SecteurActivite;
import com.gestion_magasin.gestion_magasin_stock.repository.SecteurActiviteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class SecteurActiviteImp implements ISecteurActiviteService{

    SecteurActiviteRepository secteurActiviteRepository;


    @Override
    public List<SecteurActivite> retrieveAllSecteurActivites() {
        return secteurActiviteRepository.findAll();
    }

    @Override
    public SecteurActivite addSecteurActivite(SecteurActivite sa) {
        return secteurActiviteRepository.save(sa);
    }

    @Override
    public SecteurActivite updateSecteurActivite(SecteurActivite sa) {
        return secteurActiviteRepository.save(sa);
    }

    @Override
    public SecteurActivite retrieveSecteurActivite(Long id) {
        return secteurActiviteRepository.findById(id).orElse(null);
    }

    @Override
    public void removeSecteurActivite(Long id) {
        secteurActiviteRepository.deleteById(id);

    }
}
