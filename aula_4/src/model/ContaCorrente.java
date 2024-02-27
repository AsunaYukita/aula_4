package model;

public class ContaCorrente extends Conta {
	private double Valortaxa;
	ContaCorrente(String email) {
		super(email);
		this.Valortaxa = Valortaxa;
		
	}

	public String Saque (double valorSaque) {
		if (valorSaque + Valortaxa <= saldo) { 
		saldo =- Valortaxa;
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
		saldo += valorDeposito;
		return ("valor Sacado:" + valorDeposito 
		+ "\nValor Saldo Apos o Saque: "
		+ saldo );
	}
public double getSaldo () {
	return saldo;
}

}

