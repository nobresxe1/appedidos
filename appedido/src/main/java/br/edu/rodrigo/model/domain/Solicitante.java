package br.edu.rodrigo.model.domain;

public class Solicitante {
		public String nome;
		public String cpf;
		public String email;
		public String telefone;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return nome + "; " + cpf + "; " + email + "; " + telefone;
		}

}
