package br.edu.rodrigo.model.domain;

public abstract class Produto {
	
	private String nome;
	private float valor;
	private int codigo;
	
	public abstract void impressao();
	
	public float calcularValor() {
		return valor * 0.08f;
	}
	
	@Override
	public String toString() {
		return nome + "; " + valor + "; " + codigo +";" + calcularValor();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
