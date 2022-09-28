package br.edu.rodrigo.appedido;

import br.edu.rodrigo.model.domain.Produto;

public class AppProduto {
	
	private String mensagem;
	
	public AppProduto(String mensagem) {
		this.mensagem = mensagem;
	}
	
	public void relatorio(Produto produto) {
		System.out.println(mensagem);
				
		produto.impressao();
	}
	
}
