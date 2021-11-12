package Application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import Entidades.Cardapio;
import Entidades.Chocolate;
import Entidades.Clientes;

public class Programa {

	static Scanner sc = new Scanner(System.in);
	static Queue<Clientes> filaCliente = new LinkedList<>();
	static ArrayList<Cardapio> listaCardapio = new ArrayList<>();
	static Stack<Chocolate> pilhaChocolate = new Stack<>();

	public static void main(String[] args) {

		criarClientes();
		criarCardapio();
		criarChocolates();
		exibirItens();
	}

	public static void criarClientes() {

		Clientes gabriel = new Clientes("Gabriel");
		filaCliente.add(gabriel);
		gabriel.pedirItem(0);
		Clientes karol = new Clientes("Karol");
		filaCliente.add(karol);
		karol.pedirItem(1);
		Clientes guilherme = new Clientes("Guilherme");
		filaCliente.add(guilherme);
		guilherme.pedirItem(2);
		Clientes arthur = new Clientes("Arthur");
		filaCliente.add(arthur);
		arthur.pedirItem(3);
		Clientes elenilton = new Clientes("Elenilton");
		filaCliente.add(elenilton);
		elenilton.pedirItem(4);

	}

	public static void criarCardapio() {

		Cardapio cardapio = new Cardapio("Batata Frita", 15.00, 1);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Batata Assada", 20.00, 2);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Batata Gratinada", 17.00, 3);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Frango Frito", 25.00, 4);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Frango Empanado", 22.00, 5);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Frango Assado", 30.00, 6);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Frango Gratinado", 35.00, 7);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Frango com Batata", 40.00, 8);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Batata Frita com Cheddar", 24.00, 9);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Hamburguer Caseiro", 25.00, 10);
		listaCardapio.add(cardapio);
	}

	public static void criarChocolates() {

		Chocolate chocolate = new Chocolate("Lacta");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Bom Garoto");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Hershey's");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Nestle");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Milka");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Lindt");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Cacau Show");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Sufflair");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Crunch");
		pilhaChocolate.add(chocolate);
		chocolate = new Chocolate("Diamante Negro");
		pilhaChocolate.add(chocolate);

	}

	private static double subtotal(Clientes clienteAtual, ArrayList<Cardapio> listaCardapio) {
		ArrayList<Integer> comanda = clienteAtual.getComanda();

		double totalPedido = 0.0;

		for (int i = 0; i < comanda.size(); i++) {
			int pedidoId = comanda.get(i);
			totalPedido += listaCardapio.get(pedidoId).getPreco(pedidoId);
		}

		return totalPedido;
	}

	public static void pedidos(Queue<Clientes> filaClientes, Stack<Chocolate> pilhaChocolate,
			ArrayList<Cardapio> listaCardapio) {
		for (int i = filaCliente.size(); i < 0; i--) {
			filaCliente.peek().chocolate = pilhaChocolate.peek();
			System.out.println(
					filaCliente.element().getName() + "total: R$" + subtotal(filaCliente.element(), listaCardapio)
							+ "ganhou o chocolate " + filaClientes.element().chocolate);
		}
	}

	public static void exibirItens() {
		System.out.println("Ver lista/pilha/fila digite 1");
		int opcao = sc.nextInt();
		switch (opcao) {
		case 1: {
			for (Clientes cli : filaCliente) {
				System.out.printf(cli.getName() + " \n");
			}
		}
		case 2: {
			System.out.println(pilhaChocolate.toString() + "\n");
		}
		case 3: {
			System.out.println(listaCardapio.toString());
		}
		}
	}
}