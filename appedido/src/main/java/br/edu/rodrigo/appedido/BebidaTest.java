package br.edu.rodrigo.appedido;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.rodrigo.model.domain.Bebida;

@Component
public class BebidaTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Bebida b1 = new Bebida();
		b1.codigo = 123;
		b1.nome = "cerveja";
		b1.valor = 9;
		b1.descricao = "Qual bebida o pedido 1 solicitou?";
		b1.gelada = true;
		b1.alcoolica = false;
		b1.data = LocalDateTime.now();
		b1.web = false;
		System.out.println(b1);

		Bebida b2 = new Bebida();
		b1.codigo = 231;
		b1.nome = "refrigerante";
		b1.valor = 7;
		b2.descricao = "Qual bebida o pedido 2 solicitou?";
		b1.gelada = true;
		b1.alcoolica = false;
		b2.data = LocalDateTime.now();
		b2.web = false;
		System.out.println(b2);

		Bebida b3 = new Bebida();
		b1.codigo = 331;
		b1.nome = "cafe";
		b1.valor = 5;
		b3.descricao = "Qual bebida o pedido 3 solicitou?";
		b1.gelada = true;
		b1.alcoolica = false;
		b3.data = LocalDateTime.now();
		b3.web = false;
		System.out.println(b3); 
		}
}
