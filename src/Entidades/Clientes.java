package Entidades;

public class Clientes extends Cardapio {

	private String name;

	public Clientes(String name) {
		this.name = name;
	}
	public Clientes(String name, String produto, Double preco, Integer id) {
		this.name = name;
		this.produto = getProduto();
		
	}

	public String getName() {
		return name;
	}
}
