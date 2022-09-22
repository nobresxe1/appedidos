package br.edu.rodrigo.appedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.rodrigo.model.domain.Bebida;

@Component
public class BebidaTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Bebida b01 = new Bebida();
		b01.setCodigo(123);
		b01.setNome( "cerveja");
		b01.setValor( 9);
		b01.setMarca("Qual bebida o pedido 1 solicitou?");
		b01.setTamanho(500);
		b01.setAlcoolica(true);
		System.out.println(b01);

		Bebida b02 = new Bebida();
		b02.setCodigo(231);
		b02.setNome("refrigerante");
		b02.setValor(7);
		b02.setMarca("Qual bebida o pedido 2 solicitou?");
		b02.setTamanho(300);
		b02.setAlcoolica(false);
		System.out.println(b02);

		Bebida b03 = new Bebida();
		b03.setCodigo(345);
		b03.setNome("cafe");
		b03.setValor( 5);
		b03.setMarca("Qual bebida o pedido 3 solicitou?");
		b03.setTamanho(600);
		b03.setAlcoolica(false);
		System.out.println(b03); 
		}
}
