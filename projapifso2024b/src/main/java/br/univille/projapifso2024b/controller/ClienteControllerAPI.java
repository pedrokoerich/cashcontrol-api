package br.univille.projapifso2024b.controller;

import org.springframework.web.bind.annotation.RestController;

import br.univille.projapifso2024b.entity.Cliente;
import br.univille.projapifso2024b.service.ClienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/clientes")

public class ClienteControllerAPI {
    @Autowired
    private ClienteService service;

    @GetMapping()
    public ResponseEntity<List<Cliente>> getClientes(){
        var listaClientes  = service.getAll();
        return new ResponseEntity<List<Cliente>>(listaClientes, HttpStatus.OK);
    }

}

