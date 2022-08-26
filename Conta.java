package br.estacio.banco;

public class Conta {

	private String numeroConta;
	private String titular;
	private double saldo;

	public void deposito(double valor) {
		saldo = saldo + valor;
	}

	public void saque(double valor) {
		saldo = saldo - valor;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
