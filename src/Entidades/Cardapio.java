package Entidades;

public class Cardapio {

	protected String produto;
	private Double precoPrato;
	private Integer id;

	public Cardapio() {
	}

	public Cardapio(String produto, Double preco, Integer id) {

		this.produto = produto;
		this.precoPrato = preco;
		this.id = id;
	}


	public String getProduto() {
		return produto;
	}

	public Double getPreco(double n) {
		return precoPrato;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ID " + id + "-" + produto + "-R$" + precoPrato + " \n";
	}
}