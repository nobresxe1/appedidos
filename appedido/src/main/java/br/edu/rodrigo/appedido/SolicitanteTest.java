package br.edu.rodrigo.appedido;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.rodrigo.model.domain.Solicitante;

@Component
public class SolicitanteTest  implements ApplicationRunner {

@Override
	public void run(ApplicationArguments args) throws Exception {
			Solicitante cliente01 = new Solicitante();
			cliente01.nome = "Nome do cliente 01";
			cliente01.cpf = "CPF do cliente 01";
			cliente01.email = "Email do cliente 01";
			cliente01.telefone = "Telefone do cliente 01";
			System.out.println(cliente01);
			
			Solicitante cliente02 = new Solicitante();
			cliente02.nome = "Nome do cliente 02";
			cliente02.cpf = "CPF do cliente 02";
			cliente02.email = "Email do cliente 02";
			cliente02.telefone = "Telefone do cliente 02";
			System.out.println(cliente02);
			
			Solicitante cliente03 = new Solicitante();
			cliente03.nome = "Nome do cliente 03";
			cliente03.cpf = "CPF do cliente 03";
			cliente03.email = "Email do cliente 03";
			cliente03.telefone = "Telefone do cliente 03";
			System.out.println(cliente03);
		
	}

	}
