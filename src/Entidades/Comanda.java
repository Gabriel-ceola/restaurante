package Entidades;

public class Comanda extends Cardapio {

	protected Integer prato;
	private Integer quantidadePrato;

	public Comanda() {

	}

	public Comanda(Integer prato, Integer quantidadePrato) {
		super();
		this.prato = prato;
		this.quantidadePrato = quantidadePrato;
	}

	public Integer getPrato() {
		return prato;
	}

	public Integer getValor() {
		return quantidadePrato;
	}

	public Double calcularTotal() {
		getPreco();
		return Double.valueOf(prato) * quantidadePrato;
	}
}
