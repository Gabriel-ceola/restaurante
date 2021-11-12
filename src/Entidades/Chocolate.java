package Entidades;

public class Chocolate {

	private String marca;

	public Chocolate(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Chocolate marca = " + marca + "\n";
	}

}