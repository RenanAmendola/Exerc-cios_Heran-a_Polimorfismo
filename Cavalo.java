
public class Cavalo extends Animal{


	 private String Raca;
	 private String Genero;
	 private String Cor;

	 public Cavalo(String Nome, int Idade, String Som, String Correr, String Raca, String Genero,String Cor) {
			
			super(Nome,Idade,Som,Correr);
			this.Raca = Raca;
			this.Genero = Genero;
			this.Cor = Cor;

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

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

@Override
public void Info(String info) {
		
		System.out.println("Nome: "+ getNome()+ "\nIdade: "+getIdade()+"\nSom produzido: "+getSom()+"\nCorre: "+getCorrer()
							+"\nRaça: "+ Raca + "\nGenero: "+ Genero+ "\nCor: "+ Cor);
		
		
		
	}


}
