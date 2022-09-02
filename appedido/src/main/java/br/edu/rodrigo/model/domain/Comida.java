package br.edu.rodrigo.model.domain;

import java.time.LocalDateTime;

public class Comida {
	public String descricao;
	public boolean lanche;
	public boolean pizza ;
	public boolean porcao;
	public LocalDateTime data;
	public boolean web;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return descricao + "; " + data + "; " + web + "; "
				   + porcao + "; " + pizza + "; " + lanche;
	}


}
