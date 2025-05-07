package com.corto.application.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corto.application.data.entity.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}