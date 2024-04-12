package br.univille.projapifso2024b.controller;

import org.springframework.web.bind.annotation.RestController;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/clientes")

public class ClienteControllerAPI {
    
    @GetMapping()
    public ResponseEntity<String> getClientes(){
        return new ResponseEntity<String>("MARIO", HttpStatus.OK);
    }

    class Cliente {
        private String nome;
        public Cliente (String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return this.nome;
        }
    }
}

