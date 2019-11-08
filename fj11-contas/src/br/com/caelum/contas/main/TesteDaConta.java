package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;

public class TesteDaConta {
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		System.out.println(contas.get(0));
		contas.stream().filter(conta -> conta.getNumero() == 1).findFirst();
	}
}
