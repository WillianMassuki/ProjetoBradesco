package br.com.projetobradesco.endereco.service;

import br.com.projetobradesco.endereco.interfaces.CepService;
import br.com.projetobradesco.endereco.model.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final CepService cepService;

    public Endereco detalhar(String cep) {
        return this.cepService.buscaEnderecoPorCep(cep);
    }



}
