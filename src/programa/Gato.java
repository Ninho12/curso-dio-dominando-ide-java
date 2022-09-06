package programa;

public class Gato {
	
	private String nome;
	private Integer idade;
	private String cor;
	
	

	public  Gato(String nome) {
		this.nome = nome;
		this.idade = 2;
		this.cor = "Preto";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void falar() {
		
		System.out.println("Meu nome eh "+ this.nome);
		System.out.println("Minha idade eh: "+ this.idade);
		System.out.println("Minha cor eh: "+ this.cor);
	}

}
