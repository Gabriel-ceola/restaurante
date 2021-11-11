package Entidades;

public class Comanda extends Cardapio {

	protected String prato;
	private Double valor;

	public Comanda(String prato, double valor) {
		super();
		this.prato = prato;
		this.valor = valor;
	}

	public String getPrato() {
		return prato;
	}

	public Double getValor() {
		return valor;
	}
}
