package br.edu.rodrigo.model.domain;

import java.time.LocalDateTime;

public class Bebida extends Produto{
		public String descricao;
		public boolean gelada;
		public boolean alcoolica;
		public LocalDateTime data;
		public boolean web;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return descricao + "; " + data + "; " + web
					+ "; " + alcoolica + "; " + gelada  + "; " + super.toString();
		}


}
