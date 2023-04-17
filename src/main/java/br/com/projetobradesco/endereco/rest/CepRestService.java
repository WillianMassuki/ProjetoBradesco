package br.com.projetobradesco.endereco.rest;

import br.com.projetobradesco.endereco.interfaces.CepService;
import br.com.projetobradesco.endereco.model.Endereco;
import br.com.projetobradesco.endereco.service.EnderecoService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepRestService {

	@Autowired
	private EnderecoService enderecoService;
/*
	@GetMapping("/{cep}")
	@Operation(summary = "Teste")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {
		
		Endereco endereco = cepService.buscaEnderecoPorCep(cep);
		
		return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build(); 
	}

 */

	@GetMapping("/{cep}")
	@Operation(summary = "Teste")
	public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

		Endereco endereco = enderecoService.detalhar(cep);

		return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
	}
}
