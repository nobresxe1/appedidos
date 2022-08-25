package br.edu.rodrigo.appedido;

import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.rodrigo.model.domain.Sobremesa;
@Component
public class SobremesaTest implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
			Sobremesa sobre01 = new Sobremesa();
			sobre01.descricao = " Qual sobremesa o pedido 1 solicitou?";
			sobre01.data = LocalDateTime.now();
			sobre01.web = false;
			System.out.println(sobre01);

			Sobremesa sobre02 = new Sobremesa();
			sobre02.descricao = "Qual sobremesa o pedido 2 solicitou?";
			sobre02.data = LocalDateTime.now();
			sobre02.web = false;
			System.out.println(sobre02);

			Sobremesa sobre03 = new Sobremesa();
			sobre03.descricao = "Qual sobremesa o pedido 3 solicitou?";
			sobre03.data = LocalDateTime.now();
			sobre03.web = false;
			System.out.println(sobre03);

		}

	}

