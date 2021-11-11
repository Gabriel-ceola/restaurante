package Entidades;

public class Comanda extends Cardapio {

	private String nome;
	private Integer quantidadePrato;

	public Comanda() {

	}

	public Comanda(Double preco, Integer quantidadePrato) {
		super();
		this.quantidadePrato = quantidadePrato;
	}

	public Comanda(String nome, String produto, Double precoPrato, Integer id, Integer quantidadePrato) {
		super(produto, precoPrato, id);
		this.nome = nome;
		this.quantidadePrato = quantidadePrato;
	}

	public Integer getQuantidade() {
		return quantidadePrato;
	}
}