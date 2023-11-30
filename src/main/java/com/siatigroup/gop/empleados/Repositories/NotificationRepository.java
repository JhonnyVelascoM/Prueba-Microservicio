package com.siatigroup.gop.empleados.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siatigroup.gop.empleados.Models.ClaseEntity;
import com.siatigroup.gop.empleados.Models.NotificationEntity;

public interface NotificationRepository extends JpaRepository<ClaseEntity, String> {
    ClaseEntity findByTracking(String tracking);
    Object save(NotificationEntity notificationEntity);
}
