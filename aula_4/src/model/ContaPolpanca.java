package model;

public class ContaPolpanca extends Conta{
	private double rendimento;
	ContaPolpanca (String email) {
		super (email);
		this.rendimento = rendimento;
		
	}
	public String Saque (double valorSaque) {
		if (valorSaque  <= saldo) { 
		
		saldo =- valorSaque;

		return (
				"Valor Sacado: " + valorSaque		
				+"\nValor saldo Apos o Saque:" + saldo
				);
				
		} else {
			return "Saldo insuficiente";
		}
	}
	public String Deposito (double valorDeposito) {
		saldo += (valorDeposito + (valorDeposito*rendimento));
		return ("valor Sacado:" + valorDeposito 
		+ "\nValor Saldo Após o Saque: "
		+ saldo);
		}
public double getSaldo () {
	return saldo;
	}
}
