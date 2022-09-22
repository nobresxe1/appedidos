package br.edu.rodrigo.model.domain;

public class Sobremesa extends Produto{
	private float quantidade;
	private boolean caseiro;
	private boolean gelado;
	
	@Override
	public void impressao() {
		System.out.println("#sobremesa");
		System.out.println(this);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return quantidade + "; " + caseiro + "; " + gelado + ";" + super.toString();
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isCaseiro() {
		return caseiro;
	}

	public void setCaseiro(boolean caseiro) {
		this.caseiro = caseiro;
	}

	public boolean isGelado() {
		return gelado;
	}

	public void setGelado(boolean gelado) {
		this.gelado = gelado;
	}


	
}
