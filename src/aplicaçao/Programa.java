package aplicaçao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;
		System.out.print("Entre com o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Vai fazer algum deposito inicial (S/N)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'S' || resposta == 's') {
			System.out.print("Entre com o valor inicial do deposito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);

		System.out.println("");
		System.out.print("Entre com o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);

		System.out.println("");
		System.out.print("Entre com o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);

		sc.close();
	}

}
