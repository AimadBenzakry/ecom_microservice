package com.aimad.ecompaiement.dao;

import com.aimad.ecompaiement.bean.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {
    Paiement findByRef(String ref);

}
