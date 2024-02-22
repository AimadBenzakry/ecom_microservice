package com.aimad.ecomcommande.ws.provided.facade;


import com.aimad.ecomcommande.bean.Commande;
import com.aimad.ecomcommande.service.facade.CommandeService;

import com.aimad.ecomcommande.ws.provided.converter.CommandeConverter;
import com.aimad.ecomcommande.ws.provided.vo.CommandeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ecom/commande-api")

public class CommandeProvidedRest {

    @Autowired
    private CommandeConverter commandeConverter;
    @Autowired
    private CommandeService commandeService;


    @GetMapping("/ref/{ref}")
    public CommandeVo findByRef(@PathVariable String ref) {
       Commande commande = commandeService.findByRef(ref);

        return commandeConverter.toVo(commande);
    }


    @PostMapping("/")
    public int save(@RequestBody CommandeVo commandeVo) {
        Commande commande = commandeConverter.toBean(commandeVo);
        return commandeService.save(commande);
    }


    @PutMapping("/")
    public int update(@RequestBody CommandeVo commandeVo) {
        Commande commande = commandeConverter.toBean(commandeVo);
        return commandeService.update(commande);
    }


    @GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }
}
