package com.aimad.ecompaiement.ws.required.facade;

import com.aimad.ecompaiement.ws.required.vo.CommandeVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="ecom-commande")
public interface CommandeRestRequired {

    @GetMapping("/ref/{ref}")
    public CommandeVo findByRef(@PathVariable String ref);


    @PostMapping("/")
    public int save(@RequestBody CommandeVo commandeVo);


    @PutMapping("/")
    public int update(@RequestBody CommandeVo commandeVo);


}
