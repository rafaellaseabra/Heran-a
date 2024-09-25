package Herança;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	
	public PessoaJuridica(String nome, String telefone, String cnpj) {
		super(nome,telefone); // herdando os atributos da asuperclasse!
		this.cnpj = cnpj;
}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
}