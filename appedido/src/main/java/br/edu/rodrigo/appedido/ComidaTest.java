package br.edu.rodrigo.appedido;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.rodrigo.model.domain.Comida;

@Component
public class ComidaTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Comida c01 = new Comida();
		c01.descricao = " Qual comida o cliente 1 solicitou?";
		c01.lanche = true;
		c01.pizza = false;
		c01.porcao = true;
		c01.data = LocalDateTime.now();
		c01.web = false;
		System.out.println(c01);

		Comida c02 = new Comida();
		c02.descricao = "Qual comida o cliente 2 solicitou?";
		c02.lanche = true;
		c02.pizza = false;
		c02.porcao = true;
		c02.data = LocalDateTime.now();
		c02.web = false;
		System.out.println(c02);

		Comida c03 = new Comida();
		c03.descricao = "Qual comida o cliente 3 solicitou?";
		c03.lanche = false;
		c03.pizza = true;
		c03.porcao = false;
		c03.data = LocalDateTime.now();
		c03.web = false;
		System.out.println(c03);

	}
}
