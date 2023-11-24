package com.siatigroup.gop.empleados.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "notification")

public class ClaseEntity{
    @Id
    @Column(name = "idstate")
    private Integer idstate;
    @Column(name = "tracking")
    private String tracking;    
    
}
