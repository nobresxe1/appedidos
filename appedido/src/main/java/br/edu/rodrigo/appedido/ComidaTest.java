package br.edu.rodrigo.appedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.rodrigo.model.domain.Comida;

@Component
public class ComidaTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Comida c01 = new Comida();
		c01.setCodigo(501); 
		c01.setNome("Bolinho de feijoada");
		c01.setValor(45);
		c01.setLanche(false);
		c01.setPizza(false);
		c01.setPorcao(true);
		
		System.out.println(c01);

		Comida c02 = new Comida();
		c02.setCodigo(502);
		c02.setNome("x bacon");
		c02.setValor(35);
		c02.setLanche(true);;
		c02.setPizza(false);;
		c02.setPorcao(false);
		
		System.out.println(c02);

		Comida c03 = new Comida();
		
		c03.setCodigo(591);
		c03.setNome("Carne seca");
		c03.setValor(69);
		c03.setLanche(false);
		c03.setPizza(true);
		c03.setPorcao(false);
		
		System.out.println(c03);

	}
}
