package Herança;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("João Seabra", "(15)9999-999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: "+ pessoa.getTelefone());
		System.out.println("Telefone: "+ pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica("Cecília Seabra", "(15)8888-888", "444.444.444.44","00000000.00");
		System.out.println("--------------------------------------------- ");
		System.out.println("\nPessoa Física: ");
		System.out.println("Nome: "+ pessoaFisica.getNome());
		System.out.println("Telefone: "+pessoaFisica.getTelefone());
		System.out.println("CPF: "+ pessoaFisica.getCpf());
		System.out.println("RG: "+ pessoaFisica.getRg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "(15)2222-222","12/345.678/9001-20");
		System.out.println("----------------------------------------------- ");
		System.out.println("Pessoa Jurídica: ");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: "+pessoaJuridica.getTelefone());
		System.out.println("CNPJ: "+ pessoaJuridica.getCnpj());
	}

}
