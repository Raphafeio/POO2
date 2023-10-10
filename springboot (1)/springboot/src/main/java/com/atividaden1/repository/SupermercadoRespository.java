package com.atividaden1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.repository;

import com.atividaden1.enity.Supermercado;

@Repository
public interface SupermercadoRespository extends JpaRepository<Supermercado, Integer> {

    public boolean existsByClient(String client);

    public List<Supermercado> findByClient(String client);

    @Query("select max(s.id) from Supermercado s")
    public Integer findMaxId();
}