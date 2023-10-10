package com.atividaden1.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Supermercado {

    @Id
    private int id;

    private String cliente;

    private String forma_pagamento;

    public Supermercado() {
    }

    public int getId() {
        return id;
    }

    public void setIdId(int id) {
        this.id = id;
    }

    public String getcliente() {
        return cliente;
    }

    public void setcliente(String cliente) {
       this.cliente = cliente;
    }

    public String getforma_pagamento() {
        return forma_pagamento;
    }

    public void setforma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    @Override
    public String toString() {
        return "Supermercado{" +
               "id=" + id +
               ", cliente='" + cliente + '\'' +
               ", forma_pagamento='" + forma_pagamento + '\'' +
               '}';
    }
}