package com.aimad.ecomcommande.service.impl;

import com.aimad.ecomcommande.bean.Commande;
import com.aimad.ecomcommande.dao.CommandeDao;
import com.aimad.ecomcommande.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    private CommandeDao commandeDao;

    @Override
    public Commande findByRef(String ref) {
        return commandeDao.findByRef(ref);
    }

    @Override
    public int save(Commande commande) {
        Commande cmd = commandeDao.findByRef(commande.getRef());
        if (cmd != null){
            return -1;
        }
        else if(commande.getTotalPaye()>commande.getTotal()){
            return -2;
        }
        else{
            commandeDao.save(commande);
            return 1;
        }

    }

    @Override
    public int update(Commande commande) {
        commandeDao.save(commande);
        return 1;
    }

    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }
}
