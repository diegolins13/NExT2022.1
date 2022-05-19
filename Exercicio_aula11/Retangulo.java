package exercicios;

public class Retangulo extends Quadrilatero {

	public double base;
	public double altura;
	
	public Retangulo() {
		super();
	}
	
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return this.base * this.altura;
	}
	@Override
	public double calcularPerimetro() {
		return (this.base * 2) + (this.altura * 2);
	}		
}
