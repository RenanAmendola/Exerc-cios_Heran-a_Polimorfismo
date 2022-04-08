
public abstract class Animal {
	
	private String Nome;
	private int Idade;
	private String Som;
	private String Correr;
	
	
	
	
	
	public Animal (String Nome, int Idade, String Som, String Correr) {
		
		
		this.Nome = Nome;
		this.Idade = Idade;
		this.Som = Som;
		this.Correr = Correr;
				
	}

	abstract public void  Info(String info);



	public String getNome() {
		return Nome;
	}





	public void setNome(String nome) {
		Nome = nome;
	}





	public int getIdade() {
		return Idade;
	}





	public void setIdade(int idade) {
		Idade = idade;
	}





	public String getSom() {
		return Som;
	}





	public void setSom(String som) {
		Som = som;
	}





	public String getCorrer() {
		return Correr;
	}





	public void setCorrer(String correr) {
		Correr = correr;
	}

	
	
	
	
	
	

}
