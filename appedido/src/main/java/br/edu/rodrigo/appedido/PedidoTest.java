package br.edu.rodrigo.appedido;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.rodrigo.model.domain.Pedido;

@Component
public class PedidoTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
			Pedido p1 = new Pedido();
			p1.descricao= "Pedido 1";
			p1.data = LocalDateTime.now();
			p1.web = false;
			System.out.println(p1);
			
			Pedido p2 = new Pedido();
			p2.descricao= "Pedido 2";
			p2.data = LocalDateTime.now();
			p2.web = false;
			System.out.println(p2);
			
			Pedido p3 = new Pedido();
			p3.descricao= "Pedido 3";
			p3.data = LocalDateTime.now();
			p3.web = false;
			System.out.println(p3);
		
	}

}
