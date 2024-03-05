package app;

import model.Banco;
import model.Usuario;
import view.Mensagens;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mensagens mensagem = new Mensagens();
			
			
			String Nome, CPF, Celular, Email, Senha;
			String opcao;
			int opcaonum;
			
			do {
			opcao =	mensagem.solicitarEntrada("sistema bancario"
					+"\nDigite a opção desejada"
					+"\n1. Cadastrar banco"
					+"\n2.Cadastrar Usuário"
					+"\n. Sair"
							);
			opcaonum = Integer.parseInt(opcao);
			switch (opcaonum) {
			case 1:
			String nomeBanco;
			nomeBanco = mensagem
			.solicitarEntrada("digite o nome do banco");
				Banco novoBanco = new Banco(nomeBanco);
			mensagem.mostrarMensagemDeSucesso("Banco cadastrado com sucesso"
					+ novoBanco.getBanco()
					);
				break;	
			case 2:
				mensagem.mostrarInformacao("Sistema bancario");
				Nome = mensagem.solicitarEntrada("Digite seu nome");
				Celular = mensagem.solicitarEntrada("Digite seu celular");
				Email = mensagem.solicitarEntrada("Digite seu email");
				Senha = mensagem.solicitarEntrada("Digite sua senha");
				CPF = mensagem.solicitarEntrada("Digite seu cpf");
				Usuario usuario = new Usuario( Nome,  Celular,  Email,  Senha, CPF);
			mensagem.mostrarMensagemDeSucesso( usuario.getUsuario());	
			break;
			case 3:
				System.exit(0);
					}
			}while(opcao == "ok");
			
	
	
	
	}

}
