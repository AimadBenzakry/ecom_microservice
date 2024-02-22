package com.aimad.ecomcommande.service.facade;

import com.aimad.ecomcommande.bean.Commande;

import java.util.List;

public interface CommandeService {
    Commande findByRef(String ref);
    int save(Commande cmd);
    int update(Commande cmd);
    List<Commande> findAll();
}
