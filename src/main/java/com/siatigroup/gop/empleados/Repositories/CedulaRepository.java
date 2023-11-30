package com.siatigroup.gop.empleados.Repositories;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.siatigroup.gop.empleados.Models.CedulaEntity;


public interface CedulaRepository extends JpaRepository <CedulaEntity, Integer> {
    @Query("select x from CedulaEntity x where x.dni = :dni")
    public abstract List<CedulaEntity> listaDni(@Param("dni") String dni);  
}