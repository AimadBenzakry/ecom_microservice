package com.aimad.ecomcommande.ws.provided.converter;

import com.aimad.ecomcommande.bean.Commande;
import com.aimad.ecomcommande.ws.provided.vo.CommandeVo;
import org.springframework.stereotype.Component;

@Component
public class CommandeConverter {
    public CommandeVo toVo(Commande bean){
        CommandeVo vo = new CommandeVo();
        if (bean!=null){
            if(bean.getRef() != null){
                vo.setRef(bean.getRef());
            }
            if(bean.getTotal() != null){
                vo.setTotal(bean.getTotal().toString());

            }if(bean.getTotalPaye() != null){
                vo.setTotalPaye(bean.getTotalPaye().toString());

            }if(bean.getId() != null){
                vo.setId(bean.getId());

            }
        }
        return vo;
    }

    public Commande toBean(CommandeVo vo){
        Commande bean = new Commande();
        if (vo!=null){
            if(vo.getRef() != null){
                bean.setRef(vo.getRef());
            }
            if(vo.getTotal() != null){
                bean.setTotal(Double.parseDouble(vo.getTotal()));

            }if(vo.getTotalPaye() != null){
                bean.setTotalPaye(Double.parseDouble(vo.getTotalPaye()));

            }if(vo.getId() != null){
                bean.setId(vo.getId());

            }
        }

        return bean;
    }
}
