package Herança;

public class ObjetoVeiculo {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo ("Porche","Stuttgart",2010,"Vermelha" );
		System.out.println ("\nVeículo");
		System.out.println ("Marca: " + veiculo.getMarca());
		System.out.println ("Modelo: "+ veiculo.getModelo());
		System.out.println ("Ano: "+ veiculo.getAno());
		System.out.println ("Cor: "+ veiculo.getCor());
		
		Automovel automovel = new Automovel ("Porche", "Panamera", 2009, "Branca", 4, " 4,0 l v8 elétrico");
		System.out.println ("\nAutomevel");
		System.out.println ("Marca: " + automovel.getMarca());
		System.out.println ("Modelo: "+ automovel.getModelo());
		System.out.println ("Ano: "+ automovel.getAno());
		System.out.println ("Cor: "+ automovel.getCor());
		System.out.println ("Motor: "+ automovel.getMotor());
		
		Moto moto = new Moto ("BMW", "M 1000 RR", 2009,"Branca, azul com vermelha", 999 );
		System.out.println ("\nAutomevel");
		System.out.println ("Marca: " + moto.getMarca());
		System.out.println ("Modelo: "+ moto.getModelo());
		System.out.println ("Ano: "+ moto.getAno());
		System.out.println ("Cor: "+ moto.getCor());
		System.out.println ("Cilindradas: " + moto.getCilindrada());
		
		

	}

}
