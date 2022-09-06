package programa;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		
		Gato meau = new Gato("Meau");
		
		meau.setCor("Branco");
		meau.setIdade(5);
		meau.setNome("Meau");
		
		meau.falar();
		System.out.println();
		Gato chano = new Gato("Chano");
		chano.falar();
	}
	
	
}