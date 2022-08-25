package br.edu.rodrigo.model.domain;

import java.time.LocalDateTime;

public class Pedido {
	public String descricao;
	public LocalDateTime data;
	public boolean web;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return descricao + "; " + data + "; " + web;
	}

}
