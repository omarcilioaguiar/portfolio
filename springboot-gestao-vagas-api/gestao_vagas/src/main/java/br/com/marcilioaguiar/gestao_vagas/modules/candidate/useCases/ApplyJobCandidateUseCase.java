package br.com.marcilioaguiar.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.marcilioaguiar.gestao_vagas.exceptions.JobNotFoundException;
import br.com.marcilioaguiar.gestao_vagas.exceptions.UserNotFoundException;
import br.com.marcilioaguiar.gestao_vagas.modules.candidate.repositories.CandidateRepository;
import br.com.marcilioaguiar.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    // ID do Candidato
    // ID da Vaga
    public void execute(UUID idCandidate, UUID idJob) {
        // Validar se o candidato existe
        this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });

        // Validar se a vaga existe
        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });

        // Candidato já se inscreveu na vaga?

    }
}
