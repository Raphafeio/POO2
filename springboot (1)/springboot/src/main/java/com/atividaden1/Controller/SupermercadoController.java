package com.atividaden1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.atividaden1.enity.Supermercado;
import com.atividaden1.service.SupermercadoService;

@RestController
public class SupermercadoController {

    @Autowired
    private SupermercadoService supermercadoService;

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info() {
        return "Aplicação ativa";
    }

    @RequestMapping(value = "createproduto", method = RequestMethod.GET)
    public String createproduto(@RequestBody Produto produto) {
        return supermercadoService.createproduto(Supermercado);
    }

    @RequestMapping(value = "listprodutos", method = RequestMethod.GET)
    public String listprodutos() {
        return supermercadoService.listprodutos();
    }

    @RequestMapping(value = "uptadeproduto", method = RequestMethod.GET)
    public String updateproduto(@RequestBody Produto produto) {
        return supermercadoService.updateproduto(Supermercado);
    }

    @RequestMapping(value = "deleteproduto", method = RequestMethod.GET)
    public String deleteproduto(@RequestBody Produto produto) {
        return supermercadoService.deleteproduto(Supermercado);
    }
}