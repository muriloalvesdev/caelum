package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TesteArrays {
	public static void main(String[] args) {
		Conta contas[] = new Conta[10];
		try {
			for (int i = 0; i < contas.length; i++) {
				Conta conta = new ContaCorrente();
				conta.deposita(i * 100.00);
				contas[i] = conta;
				System.out.println(
						"Saldo inserido com sucesso, saldo da conta número [" + i + "] é: " + conta.getSaldo());
			}
		} catch (Exception e) {
			System.out.println("Erro ao tentar depositar e salvar a conta no Array!");
		}
		double total = 0;

		for (Conta conta : contas) {
			total = +conta.getSaldo();
		}

		System.out.println("Este é o total do  saldo de todas as contas: " + total);
		System.out.println("A média do saldo das contas: " + total / 10);
	}
}
