package com.example.miprimerproyectospring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity,Integer> {
    Optional<ClienteEntity>findByNombre(String nombre);


    @Override
    Optional<ClienteEntity> findById(Integer integer);


}
