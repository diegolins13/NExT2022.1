package exercicios;

import java.util.Scanner;

public class Dvd extends Midia {

	private int nFaixas;

	public Dvd() {
		super();
	}
	
	public Dvd(int c, double p, String n, int f) {
		super(c,p,n);
		this.nFaixas = f;
	}
	
	@Override
	public String getTipo() {
		return "DVD";
	}
	
	@Override
	public String getDetalhes() {
		return super.getDetalhes()
			   + " , " + this.nFaixas;
	}
		
	public void setFaixas(int f) {
		this.nFaixas = f;
	}
	
	@Override
	public void inserirDados() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		super.inserirDados();
		sc.nextLine();
		System.out.print("Digite o numero de faixas: ");
		this.nFaixas = sc.nextInt();
	}
	
}
