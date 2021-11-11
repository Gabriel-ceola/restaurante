package Entidades;

public class Cardapio {

	protected String produto;
	private Double preco;
	private Integer id;

	public Cardapio(String produto, Double preco, Integer id) {

		this.produto = produto;
		this.preco = preco;
		this.id = id;
	}

	public Cardapio() {
	}

	public String getProduto() {
		return produto;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getId(Integer n) {
		return id;
	}

	@Override
	public String toString() {
		return "ID " + id + "-" + produto + "-R$" + preco + " \n";
	}

}
