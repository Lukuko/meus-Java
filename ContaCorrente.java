package br.estacio.banco;

public class ContaCorrente extends Conta {
	private double tarifaMensal;
	
	public double getTarifaMensal() {
		return tarifaMensal;
	}
	
	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}

	public String getResumo() {
		return "Olá " + titular + "! Seu saldo é de " + saldo + "a sua tarifa é: " + tarifaMensal;
	}

