package br.edu.rodrigo.appedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.rodrigo.model.domain.Sobremesa;

@Component
public class SobremesaTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Sobremesa sobre01 = new Sobremesa();
		sobre01.setQuantidade(2);
		sobre01.setCodigo(1001);
		sobre01.setNome("Pudin ");
		sobre01.setValor(15);
		sobre01.setGelado(true);
		sobre01.setCaseiro(false);
		System.out.println(sobre01);

		Sobremesa sobre02 = new Sobremesa();
		sobre02.setQuantidade(2);
		sobre02.setCodigo(1002);
		sobre02.setNome("Musse ");
		sobre02.setValor(10);
		sobre02.setGelado(true);
		sobre02.setCaseiro(false);
		System.out.println(sobre02);

		Sobremesa sobre03 = new Sobremesa();
		sobre03.setQuantidade(5);
		sobre03.setCodigo(1005);
		sobre03.setNome("Brigadeiro ");
		sobre03.setValor(8);
		sobre03.setGelado(false);
		sobre03.setCaseiro(true);
		System.out.println(sobre03);

	}

}
