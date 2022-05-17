package exercicios;

import java.util.Scanner;

public class Cd extends Midia {

	private int nMusicas;

	public Cd() {
		super();
	}

	public Cd(int c, double p, String n, int m) {
		super(c,p,n);
		this.nMusicas = m;
	}
	
	@Override
	public String getTipo() {
		return "CD";
	}
	
	@Override
	public String getDetalhes() {
		return super.getDetalhes()
			   + ", " + this.nMusicas; 	
	}
	
	public int getnMusicas() {
		return nMusicas;
	}
	
	public void setMusicas(int m) {
		this.nMusicas = m;
	}

	@Override
	public void inserirDados() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		super.inserirDados();
		sc.nextLine();
		System.out.print("Digite o numero de musicas: ");
		this.nMusicas = sc.nextInt();
	}

}
