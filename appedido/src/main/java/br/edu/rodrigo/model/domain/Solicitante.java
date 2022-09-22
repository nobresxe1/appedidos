package br.edu.rodrigo.model.domain;

public class Solicitante {
	public String nome;
	public String cpf;
	public String email;
	public String telefone;

	public void impressao() {
		System.out.println("#solicitante");
		System.out.println(this);
	}

	@Override
	public String toString() {
		return nome + "; " + cpf + "; " + email + "; " + telefone;
	}

}
