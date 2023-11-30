package com.siatigroup.gop.empleados.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siatigroup.gop.empleados.Models.NumberppbEntity;

public interface NumberppbRepository extends JpaRepository<NumberppbEntity, String> {
    NumberppbEntity findByPpbnumber(String ppbnumber);
}
