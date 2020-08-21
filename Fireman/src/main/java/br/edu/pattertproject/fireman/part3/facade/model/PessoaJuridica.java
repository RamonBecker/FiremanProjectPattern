package br.edu.pattertproject.fireman.part3.facade.model;

import br.edu.pattertproject.fireman.part1.entites.documents.Documento;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	private String nomeFantasia;
	
	public PessoaJuridica() {
	}
	
	
	
	public PessoaJuridica(Documento documento, String razaoSocial, String nomeFantasia) {
		super(documento);
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	@Override
	public String toString() {
		return "Pessoa Juridica: razaoSocial:" + razaoSocial + ", nomeFantasia:" + nomeFantasia + "\n";
	}

}