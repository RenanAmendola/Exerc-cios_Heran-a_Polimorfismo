
public class Pregui?a extends Animal{
	
	
	
	private String Cor;
	private String Genero;
	
	
	
	public Pregui?a(String Nome, int Idade, String Som, String Correr, String Cor, String Genero) {
		
	
	super(Nome,Idade,Som,Correr);
	this.Genero = Genero;
	this.Cor = Cor;
				
	}



	public String getCor() {
		return Cor;
	}



	public void setCor(String cor) {
		Cor = cor;
	}



	public String getGenero() {
		return Genero;
	}



	public void setGenero(String genero) {
		Genero = genero;
	}

@Override	
public void Info(String info) {
		
		System.out.println("Nome: "+ getNome()+ "\nIdade: "+getIdade()+"\nSom produzido: "+getSom()+"\nCorre: "+getCorrer()
							+ "\nGenero: "+ Genero+"\nCor: "+Cor);
		
		
		
	}
	
	
}
