
public class Carro extends Veiculo {

	public int porta;

	public Carro(String marca, String modelo, int porta) {
		super(marca, modelo);
		this.porta = porta;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}
	
}
