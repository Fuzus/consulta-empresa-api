package br.com.fuzus.consultaempresaapi.repository;

import br.com.fuzus.consultaempresaapi.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Model, Integer> {
}
