package com.siatigroup.gop.empleados.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siatigroup.gop.empleados.Models.ClaseEntity;

public interface ClaseRepository extends JpaRepository <ClaseEntity,String>{
    ClaseEntity findByTracking(String tracking);
    
}

