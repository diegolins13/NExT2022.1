package exercicios;

import java.util.Scanner;

public class Midia {

	private int codigo;
	private double preco;
	private String nome;
	
	public Midia() {
		super();
	}

	public Midia(int c, double p, String n) {
		super();
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return "Midia";
	}
	
	public String getDetalhes() {
		return "Informações: "
				+ ", " + this.codigo
				+ ", " + this.preco
				+ ", " + this.nome;
	}
	
	public void printDados() {
		this.getTipo();
		this.getDetalhes();
	}
	
	public void inserirDados() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o código: ");
		this.codigo = sc.nextInt();
		System.out.print("Digite o preco: ");
		this.preco = sc.nextDouble();
		System.out.print("Digite o nome: ");
		this.nome = sc.nextLine();
	}
}
