package com.siatigroup.gop.empleados.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siatigroup.gop.empleados.Models.LogEntity;

public interface LogRepository extends JpaRepository<LogEntity, Integer> {
    
}
