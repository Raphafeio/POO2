package com.atividaden1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atividaden1.enity.Supermercado;
import com.atividaden1.repository.SupermercadoRespository;
import jakarta.transaction.Transactional;

@Service
public class SupermercadoService {

    @Autowired(required = false)
    private SupermercadoRespository supermercadoRespository;

    @Transactional
    public String createProduto(Produto produto) {
        try {
            if (!supermercadoRespository.existsByCliente(supermercado.getCliente())) {
                supermercado.setId(null == supermercadoRespository.findMaxId() ? 0 : supermercadoRespository.findMaxId() + 1);
                supermercadoRespository.save(supermercado);
                return "produto cadastrado com sucesso.";
            }else {
                return "produto já existe no database.";
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Supermercado> listprodutos() {
        return supermercadoRespository.findAll();
    }

    @Transactional
    public String updateproduto(Produto produto) {
        if (supermercadoRespository.existsByCliente(supermercado.getCliente())) {
            try {
                List<Supermercado> supermercado = supermercadoRespository.findByCliente(supermercado.getCliente());
                produtos.stream().forEach(s -> {
                    Supermercado produtoToBeuptade = supermercadoRespository.findById(s.getId()).get();
                    produtoToBeuptade.setnome(produto.getnome());
                    produtoToBeuptade.setvalidade(produto.getvalidade());
                    supermercadoRespository.save(produtoToBeuptade);
                });
                return "produto atualizado.";
            } catch (Exception e) {
                throw e;
            }
        } else {
            return "produto não existe no banco";
        }
    }

    @Transactional
    public String deleteproduto(Produto produto) {
        if (supermercadoRespository.existsByCliente(produto.getCliente())) {
            try {
                List<Supermercado> supermercados = supermercadoRespository.findByCliente(getCliente());
                produtos.stream().forEach(s -> {
                    supermercadoRespository.delete(s);
                });
                return "produto deletado.";
            } catch (Exception e) {
                throw e;
            }
        } else {
            return "produto n\u00e3o existe no banco.";
        }
    }
}