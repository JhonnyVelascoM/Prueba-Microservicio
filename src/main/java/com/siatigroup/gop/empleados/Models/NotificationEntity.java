package com.siatigroup.gop.empleados.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "notification")

public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idstatus")
    private Integer idstatus;
    @Column(name = "dni")
    private String dni;
    @Column(name = "idstate")
    private Integer idstate;
    @Column(name = "ppbnumber")
    private String ppbnumber;
    @Column(name = "whnumber")
    private String whnumber;
    @Column(name = "tracking")
    private String tracking;
}

