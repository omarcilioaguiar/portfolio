package br.com.marcilioaguiar.gestao_vagas.modules.company.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.com.marcilioaguiar.gestao_vagas.modules.company.entities.CompanyEntity;

public interface CompanyRepository extends CrudRepository<CompanyEntity, UUID>{
    Optional<CompanyEntity> findByUsernameOrEmail(String username, String email);
}
