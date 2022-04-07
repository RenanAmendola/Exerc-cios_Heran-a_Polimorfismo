
public class Cachorro extends Animal{

	
	
	private String Raca;
	private String Genero;
	
	
	
	public Cachorro(String Nome, int Idade, String Som, String Correr, String Raca, String Genero) {
		
		super(Nome,Idade,Som,Correr);
		this.Raca = Raca;
		this.Genero = Genero;
	

	}



	public String getRaca() {
		return Raca;
	}



	public void setRaca(String raca) {
		Raca = raca;
	}



	public String getGenero() {
		return Genero;
	}



	public void setGenero(String genero) {
		Genero = genero;
	}
		
	

	public void InfoC() {
		
		System.out.println("Nome: "+ getNome()+ "\nIdade: "+getIdade()+"\nSom produzido: "+getSom()+"\nCorre: "+getCorrer()
							+"\nRaça: "+ Raca + "\nGenero: "+ Genero);
		
		
		
	}
	
	
	
}