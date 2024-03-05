package model;

import java.util.ArrayList;
import java.util.UUID;

public class Banco {
private String nome_banco;
private String certificado_autorizacao;
private ArrayList<Usuario>usuarios; 

public Banco(String nome ) {
	this.nome_banco = nome;
	this.certificado_autorizacao 
	= UUID.randomUUID().toString();
}


public String CriarUsuario(
		String Nome, String CPF, 
		String Celular, String Senha, String Email) 	{
		Usuario usuarioNovo = new Usuario(Nome, CPF, Email, Celular, Senha);
	usuarios.add(usuarioNovo);
	return "Usuario cadastrado";
	}
public String getBanco() {
	return (
	"\nNome do banco: " + this.nome_banco
	+"\nCertificado: " + this.certificado_autorizacao		
			);
		}
}	