package com.siatigroup.gop.empleados.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siatigroup.gop.empleados.Models.WhEntity;

public interface WhRepository extends JpaRepository<WhEntity, String> {
    WhEntity findByWhnumber(String whnumber);
}
