package com.aimad.ecompaiement.service.facade;

import com.aimad.ecompaiement.bean.Paiement;

import java.util.List;

public interface PaiementService {
    Paiement findByRef(String ref);
    int save(Paiement paiement);
    int update(Paiement paiement);
    List<Paiement> findAll();
}
