package Entidades;

import java.util.ArrayList;

public class Clientes extends Cardapio {

	private String name;

	public Chocolate chocolate;

	ArrayList<Integer> comanda = new ArrayList<>();

	public Clientes() {

	}

	public Clientes(String name) {
		this.name = name;
	}

	public Clientes(String name, String string) {
		this.name = name;
		this.produto = getProduto();

	}

	public String getName() {
		return name;
	}

	public Double totalRefeicao() {
		return 0.0;
	}

	public void pedirItem(int id) {
		this.comanda.add(id);
	}

	public ArrayList<Integer> getComanda() {
		return this.comanda;
	}

	public void ganharChocolate(Chocolate nomeChocolate) {
		this.chocolate = nomeChocolate;
	}
}