package br.com.fuzus.consultaempresaapi.config;

import br.com.fuzus.consultaempresaapi.model.Model;
import br.com.fuzus.consultaempresaapi.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Mock implements CommandLineRunner {

    @Autowired
    private EmpresaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Model model1 = new Model("Joao", "joao@gmail.com","Luz e Energia Solar", "35.161.665/0001-61");
        Model model2 = new Model("Maria", "maria2@gmail.com", "Presentes para todos", "52.404.423/0001-70");
        Model model3 = new Model("Jose", "jose3@gmail.com", "Mecanica Jose's","34.784.868/0001-41");
        Model model4 = new Model("Lucas", "lucas@gmail.com", "Lucas Arquiteturas","55.927.658/0001-35");

        repository.saveAll(Arrays.asList(model1, model2, model3, model4));
    }
}
