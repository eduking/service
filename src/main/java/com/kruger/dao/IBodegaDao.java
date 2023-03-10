package com.kruger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kruger.model.Bodega;

public interface IBodegaDao extends JpaRepository<Bodega,Integer>{
    
    
}
