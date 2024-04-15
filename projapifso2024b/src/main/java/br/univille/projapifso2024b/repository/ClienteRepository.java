package br.univille.projapifso2024b.repository;

import org.springframework.stereotype.Repository;

import br.univille.projapifso2024b.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ClienteRepository 
    extends JpaRepository<Cliente,Long> {

}


