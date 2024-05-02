package br.com.adasJSF.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.adasJSF.model.Pessoa;

@Named("pessoaBean")
@SessionScoped
public class PessoaBean implements Serializable {

	// Serial implementado pela Interface
	private static final long serialVersionUID = 1L;

	// Injeção de dependência da classe Pessoa no pacote Model
	@Inject
	private Pessoa pessoa;
	
	List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	private int idSequencia = 1;
	
	// Declaração dos métodos da Bean
	public String adicionar() {
		pessoa.setId(this.getIdSequenciaId());
		pessoas.add(pessoa);
		pessoa = new Pessoa();
		return null;
	}
	
	private int getIdSequenciaId() {
		//this.idSequencia++;
		return this.idSequencia++;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
	
	
}
