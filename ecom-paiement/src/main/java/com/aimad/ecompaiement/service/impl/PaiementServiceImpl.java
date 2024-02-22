package com.aimad.ecompaiement.service.impl;

import com.aimad.ecompaiement.Util.NumberUtil;
import com.aimad.ecompaiement.bean.Paiement;
import com.aimad.ecompaiement.dao.PaiementDao;
import com.aimad.ecompaiement.service.facade.PaiementService;
import com.aimad.ecompaiement.ws.required.facade.CommandeRestRequired;
import com.aimad.ecompaiement.ws.required.vo.CommandeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaiementServiceImpl implements PaiementService {
    @Autowired
    private PaiementDao paiementDao;

    @Autowired
    private CommandeRestRequired commandeRestRequired;


    @Override
    public Paiement findByRef(String ref) {
        return paiementDao.findByRef(ref);
    }

    @Override
    public int save(Paiement paiement) {
        CommandeVo commandeVo = commandeRestRequired.findByRef(paiement.getCommandeRef());
        System.out.println(commandeVo.getRef());
        if (commandeVo==null || commandeVo.getId()==null){
            return -1;
        } else if (NumberUtil.toDouble(commandeVo.getTotalPaye())+paiement.getMontant()>NumberUtil.toDouble(commandeVo.getTotal())) {
            return -2;
        } else{
            paiementDao.save(paiement);
            commandeVo.setTotalPaye(NumberUtil.toString(NumberUtil.toDouble(commandeVo.getTotalPaye())+paiement.getMontant()));
            commandeRestRequired.update(commandeVo);
            return 1;
        }
        

    }

    @Override
    public int update(Paiement paiement) {
        paiementDao.save(paiement);
        return 1;
    }

    @Override
    public List<Paiement> findAll() {
        return paiementDao.findAll();
    }
}
