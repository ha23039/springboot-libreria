package com.corto.application.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corto.application.data.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}