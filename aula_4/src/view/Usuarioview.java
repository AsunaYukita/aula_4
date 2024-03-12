package view;

import model.ContaCorrente;
import model.ContaPoupanca;

public class Usuarioview {
public void InterfacedoUsuario () {
	Mensagens mensagem = new Mensagens(); 
	
	int Opcao;
	String OpcaoSelecionada; 
	 
	 OpcaoSelecionada = mensagem.solicitarEntrada(
			 "selecione uma opção"
			 +"\n1- Criar conta"
			 +"\n2- Fazer saque"
			 +"\n3- Verificar saldo");
	 Opcao = Integer.parseInt(OpcaoSelecionada); 
	 switch (Opcao) {
	case 1:
	String TipoDeConta;
TipoDeConta = mensagem.solicitarEntrada("Qual tipo de conta você deseja?"
		+"\n1- Conta Poupança"
		+"\n2- Conta Corrente"); 	
	
 String EmailUsuario;

EmailUsuario = mensagem.solicitarEntrada("Digite seu email");


if (TipoDeConta.equals("1")) {
		ContaPoupanca conta = new ContaPoupanca(EmailUsuario);
	}

if(TipoDeConta.equals("2")) {
	//intanciar conta polpança
	ContaCorrente conta = new ContaCorrente(EmailUsuario);

	
	  		}

		break;
	
	case 2:
		
	break;
				}
		}
}
