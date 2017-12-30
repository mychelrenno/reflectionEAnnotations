package br.com.mychelrenno.reflectionEAnnotations.model;

import br.com.mychelrenno.reflectionEAnnotations.annotations.Column;

@Column(name="id", tipo="long")
public class Pessoa {

	private Long id;
	private String nome;
	private String cpf;

//	@Column(name="id", tipo="long")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
