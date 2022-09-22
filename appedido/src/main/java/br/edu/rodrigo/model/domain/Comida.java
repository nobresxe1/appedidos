package br.edu.rodrigo.model.domain;

public class Comida extends Produto {
	private boolean lanche;
	private boolean pizza;
	private boolean porcao;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return porcao + "; " + pizza + "; " + lanche + "; " + super.toString();
	}

	@Override
	public void impressao() {
		System.out.println("#comida");
		System.out.println(this);

	}

	public boolean isLanche() {
		return lanche;
	}

	public void setLanche(boolean lanche) {
		this.lanche = lanche;
	}

	public boolean isPizza() {
		return pizza;
	}

	public void setPizza(boolean pizza) {
		this.pizza = pizza;
	}

	public boolean isPorcao() {
		return porcao;
	}

	public void setPorcao(boolean porcao) {
		this.porcao = porcao;
	}

}
