package br.estacio.banco;

public class Teste {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setTitular("Anderson Oliveira");
		conta.setNumeroConta("1000-X");
		conta.setSaldo(0);
		
		conta.deposito(200);
		conta.saque(50);
		System.out.println("Nome Titular: " +conta.getTitular());
		System.out.println("Conta: " +conta.getNumeroConta());
		System.out.println("Saldo: " +conta.getSaldo());
		
		Conta conta1 = new Conta();
		
		conta1.setTitular("Aline Carvalho");
		conta1.setNumeroConta("2001-X");
		conta1.setSaldo(0);
		
		conta1.deposito(500);
		conta1.saque(150);
		System.out.println("Nome Titular: " +conta1.getTitular());
		System.out.println("Conta: " +conta1.getNumeroConta());
		System.out.println("Saldo: " +conta1.getSaldo());
		
		// TODO Auto-generated method stub
	}

}
