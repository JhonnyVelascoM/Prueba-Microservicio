package com.siatigroup.gop.empleados.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "notification")

public class CedulaEntity {
    @Id
    private Integer idstatus;
    @Column(name = "dni")
    private String dni;
    @Column(name = "idstate")
    private Integer idstate;
    @Column(name = "ppbnumber")
    private String ppbnumber;
    @Column (name = "whnumber")
    private String whnumber;
    @Column(name = "tracking")
    private String tracking;     
}