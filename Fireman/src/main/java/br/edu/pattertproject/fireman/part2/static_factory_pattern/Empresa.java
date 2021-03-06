package br.edu.pattertproject.fireman.part2.static_factory_pattern;

public class Empresa extends PessoaJuridica {

	private String ocupacao;

	public Empresa() {
		super();
	}

	public Empresa(String ocupacao) {
		super();
		this.ocupacao = ocupacao;
	}

	public Empresa(Documento documento, String razaoSocial, String nomeFantasia, String ocupacao) {
		super(documento, razaoSocial, nomeFantasia);
		if (ocupacao.isEmpty() || ocupacao == null) {
			throw new IllegalArgumentException("A ocupação não pode ser vazio");
		}
		this.ocupacao = ocupacao;
	}

	public Empresa(String razaoSocial, String nomeFantasia) {
		super(razaoSocial, nomeFantasia);
	}

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		if (ocupacao.isEmpty() || ocupacao == null) {
			throw new IllegalArgumentException("A ocupação não pode ser vazio");
		}
		this.ocupacao = ocupacao;
	}

	@Override
	public String toString() {
		return "Empresa [ocupacao=" + ocupacao + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia
				+ "]";
	}

}
