package br.com.caelum.contas;

import br.com.caelum.contas.exception.SaldoInsuficienteException;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;

public class TestaTributavel {

	public static void main(String[] args) {
		try {
			ContaCorrente cc = new ContaCorrente();
			cc.deposita(1235);
			System.out.println(cc.getValorImposto());

			Tributavel t = cc;

			System.out.println(t.getValorImposto());
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}

}
