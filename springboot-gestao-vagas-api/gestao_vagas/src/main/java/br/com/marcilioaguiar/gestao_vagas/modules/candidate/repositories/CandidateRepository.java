package br.com.marcilioaguiar.gestao_vagas.modules.candidate.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.com.marcilioaguiar.gestao_vagas.modules.candidate.entities.CandidateEntity;

public interface CandidateRepository extends CrudRepository<CandidateEntity, UUID>{
    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);
}