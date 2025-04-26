package br.com.marcilioaguiar.gestao_vagas.modules.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcilioaguiar.gestao_vagas.modules.company.entities.JobEntity;
import br.com.marcilioaguiar.gestao_vagas.modules.company.useCases.CreateJobeUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {
    
    @Autowired
    private CreateJobeUseCase createJobeUseCase;

    @PostMapping("/")
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity) {
        return this.createJobeUseCase.execute(jobEntity);
    }
}
