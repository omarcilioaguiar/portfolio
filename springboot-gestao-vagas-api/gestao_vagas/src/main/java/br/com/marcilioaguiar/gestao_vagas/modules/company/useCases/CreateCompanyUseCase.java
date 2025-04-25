package br.com.marcilioaguiar.gestao_vagas.modules.company.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcilioaguiar.gestao_vagas.exceptions.UserFoundException;
import br.com.marcilioaguiar.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.marcilioaguiar.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity) {
        this.companyRepository
                .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundException();
                });

                return null;
       // return this.companyRepository.save(companyEntity); verificar o que está ocorrendo aqui
    }
}
