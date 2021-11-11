package Application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import Entidades.Cardapio;
import Entidades.Chocolate;
import Entidades.Clientes;
import Entidades.Comanda;

public class Programa {

	private static Scanner sc = new Scanner(System.in);
	private static Queue<Clientes> filaCliente = new LinkedList<>();
	private static ArrayList<Cardapio> listaCardapio = new ArrayList<>();
	private static Stack<Chocolate> pilhaChocolate = new Stack<>();
	private static List<Comanda> list = new ArrayList<>();

	public static void main(String[] args) {

		criarClientes();
		criarCardapio();
		criarChocolates();
		pedidos();
		fatura();

	}

	private static void criarClientes() {

		Clientes clientes = new Clientes("Gabriel");
		filaCliente.add(clientes);
		clientes = new Clientes("Arthur");
		filaCliente.add(clientes);
		clientes = new Clientes("Elenilton");
		filaCliente.add(clientes);
		clientes = new Clientes("Guilherme");
		filaCliente.add(clientes);
		clientes = new Clientes("Karol");
		filaCliente.add(clientes);
		clientes = new Clientes("João");
		filaCliente.add(clientes);
		clientes = new Clientes("Gustavo");
		filaCliente.add(clientes);

	}

	private static void criarCardapio() {

		Cardapio cardapio = new Cardapio("Batata Frita", 15.00, 1);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Batata Assada", 20.00, 2);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Batata Gratinada", 17.00, 3);
		listaCardapio.add(cardapio);
		cardapio = new Cardapio("Frango Frit0", 25.00, 4);
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

	private static void criarChocolates() {

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

	private static void pedidos() {

		for (Cardapio card : listaCardapio) {
			for (Clientes cli : filaCliente) {
				System.out.println("Faça seu pedido, " + cli.getName());
				System.out.println();
				System.out.println("Qual prato irá escolher? Insira o ID do prato");
				System.out.println();
				System.out.println(listaCardapio.toString());
				int n = sc.nextInt();
				System.out.println("Quantos unidades?");
				int quantidadePrato = sc.nextInt();
				if (n == card.getId()) {
					String prato = card.getProduto();
					double preco = card.getPreco();
					int id = card.getId();
					double valor = preco * quantidadePrato;

					Comanda comanda = new Comanda(prato, valor);
				}
			}
		}
	}

	private static void fatura() {
		for (Chocolate choco : pilhaChocolate) {
			for (Comanda comand : list) {
				for (Clientes clientes : filaCliente) {
					System.out.println("Prato escolhido por " + clientes.getName() + comand.getPrato() + "R$"
							+ comand.getValor() + ", chocolate sorteado: " + choco.getMarca());
				}
			}
		}
	}
}
