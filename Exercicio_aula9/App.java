package exercicios;

public class App {

	public static void main(String[] args) {
		
		Dvd dvd1 = new Dvd();
		Cd cd1 = new Cd();
		
		System.out.println("-----------DVD-----------");
		dvd1.inserirDados();
		dvd1.printDados();
		
		System.out.println(" ");
		
		System.out.println("-----------CD-----------");
		cd1.inserirDados();
		cd1.printDados();
	}

}
