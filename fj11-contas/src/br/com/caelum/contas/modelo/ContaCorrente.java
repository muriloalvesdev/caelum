package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void saca(double valor) {
		try {
			if (this.saldo < 0) {
				throw new IllegalArgumentException("Sua conta não contém saldo positivo!");
			} else if (this.saldo < valor) {
				throw new SaldoInsuficienteException("Saldo insuficiente para efetuar o saque!");
			} else {
				this.saldo -= (valor + 0.10);
			}
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}
}
