package com.aimad.ecompaiement.ws.provided.facade;


import com.aimad.ecompaiement.bean.Paiement;
import com.aimad.ecompaiement.service.facade.PaiementService;
import com.aimad.ecompaiement.ws.required.facade.CommandeRestRequired;
import com.aimad.ecompaiement.ws.required.vo.CommandeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ecom/paiement-api")

public class PaiementProvidedRest {
    @Autowired
    private PaiementService commandeService;


    @GetMapping("/ref/{ref}")
    public Paiement findByRef(@PathVariable String ref) {
        return commandeService.findByRef(ref);
    }


    @PostMapping("/")
    public int save(@RequestBody Paiement paiement) {

        return commandeService.save(paiement);
    }


    @PutMapping("/")
    public int update(Paiement paiement) {
        return commandeService.update(paiement);
    }


    @GetMapping("/")
    public List<Paiement> findAll() {
        return commandeService.findAll();
    }
}
