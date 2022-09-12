public class App {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setCpf("0454646");
		pessoa.setEnd("Rua 3");
		
		System.out.println("\nNome é: "+pessoa.getNome());
		System.out.println("\nCPF  é: "+pessoa.getCpf());
		System.out.println("\nEndereço  é: "+pessoa.getEnd("Rua 3"));
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario((float) 5000.00);
		
		System.out.println("\nNome do funcionário é: "+pessoa.getNome());
		System.out.println("\nCPF do funcionário é: "+pessoa.getCpf());
		System.out.println("\nEndereço do funcionário é: "+pessoa.getEnd("Rua 3"));
		System.out.println("\nSalário do funcionário é: "+funcionario.getSalario());
		
		Professor professor = new Professor();
		System.out.println("\bNome do professor é: "+pessoa.getNome());
		System.out.println("\nCPF do professor é: "+pessoa.getCpf());
		System.out.println("\nEndereço do professor é: "+pessoa.getEnd("Rua 3"));
		System.out.printf("\nSalário do professor é: "+professor.getSalario() );
		
		Coordenador Coordenador = new Coordenador();
		Coordenador.setCurso("ADS");
		
		System.out.println("\nNome do coordenador é: "+pessoa.getNome());
		System.out.println("\nCPF do coordenador é: "+pessoa.getCpf());
		System.out.println("\nEndereço do coordenador é: "+pessoa.getEnd("Rua 3"));
		System.out.println("\nCurso do coordenador é: "+Coordenador.getCurso());
		System.out.println("\nSalário do coordenador é: "+funcionario.getSalario());
	}
		
		
}
