package com.corto.application.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corto.application.data.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}