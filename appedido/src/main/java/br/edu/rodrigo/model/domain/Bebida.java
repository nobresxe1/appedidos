package br.edu.rodrigo.model.domain;

public class Bebida extends Produto {
	private String marca;
	private float tamanho;
	private boolean alcoolica;

	@Override
	public float calcularValor() {
		float valorTamanho = tamanho * 0.04f;
		return super.calcularValor();
	}

	@Override
	public void impressao() {
		System.out.println("#bebida");
		System.out.println(this);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return marca + "; " + alcoolica + "; " + tamanho + "; " + super.toString();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isAlcoolica() {
		return alcoolica;
	}

	public void setAlcoolica(boolean alcoolica) {
		this.alcoolica = alcoolica;
	}

}
