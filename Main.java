
public class Main {

	public static void main(String[] args) {
		
		
		
		Cachorro Dog = new Cachorro("Loki",2,"latido","Muito","Shi-tsu","Macho");
		Cavalo Cav = new Cavalo("Pé de pano",8,"Som de cavalo padrao","Mais ainda","Quarto de milha","Macho","Branco");
		Preguiça Pre = new Preguiça("Preguiça",5,"????","Nope","Femea","Caramelo");
		
		Animal Animal = null;
		
		int n = (int) (Math.random()*3.0);
		
		switch(n) {
		
		
		case 0: Animal = Dog;break;
		
		case 1: Animal = Cav;break;
		
		case 2: Animal = Pre;break;

		default: System.out.println("Erro inesperado");break;
						
		}
		
		if(Animal != null) {
			
			Animal.Info(null);
						
		}
				
	}

}
