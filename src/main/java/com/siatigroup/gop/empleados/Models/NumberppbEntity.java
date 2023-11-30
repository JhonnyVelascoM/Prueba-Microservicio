package com.siatigroup.gop.empleados.Models;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "notification")

public class NumberppbEntity {
    @Id
    @Column(name = "ppbnumber")
    private String ppbnumber;
    @Column(name = "idstate")
    private Integer idstate;
    @Column(name = "lastdate")
    private Timestamp lastdate;
}
