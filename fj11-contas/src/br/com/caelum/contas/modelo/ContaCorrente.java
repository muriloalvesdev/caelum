package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	@Override
	public void saca(double valor) {
		try {
			if (this.saldo >= valor) {
				this.saldo -= (valor + 0.10);
			} else {
				throw new SaldoInsuficienteException("Saldo insuficiente para efetuar o saque!");
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
