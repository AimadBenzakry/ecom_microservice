package com.aimad.ecomcommande.ws.provided.vo;

public class CommandeVo {
    private Long id;
    private String ref;
    private String total;
    private String totalPaye;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(String totalPaye) {
        this.totalPaye = totalPaye;
    }
}
