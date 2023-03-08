package br.com.fuzus.consultaempresaapi.controller;

import br.com.fuzus.consultaempresaapi.model.Model;
import br.com.fuzus.consultaempresaapi.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listaEmpresas")
public class EndPoint {

    @Autowired
    private EmpresaRepository repository;

    @GetMapping
    public ResponseEntity<List<Model>> getAll() {
        List<Model> list = repository.findAll();
        return ResponseEntity.ok(list);
    }
}
