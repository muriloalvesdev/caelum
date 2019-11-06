package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {
	private Conta conta;

	public void criaConta(Evento evento) {
		String tipo = evento.getSelecionadoNoRadio("tipo");

		if (tipo.equals("Conta Corrente")) {
			this.conta = new ContaCorrente();
		} else {
			this.conta = new ContaPoupanca();
		}

		this.conta = new Conta();
		this.conta.setTitular(evento.getString("titular"));
		this.conta.setNumero(evento.getInt("numero"));
		this.conta.setAgencia(evento.getString("agencia"));
	}

	public void saca(Evento evento) {
		if (this.conta.getTipo().equals("Conta Corrente")) {
			this.conta.saca(getValorOperacao(evento) + 0.10);
		} else {
			this.conta.saca(getValorOperacao(evento));
		}
	}

	public void transfere(Evento evento) {
		Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
		this.conta.transfere(evento.getDouble("valorTransferencia"), destino);
	}

	public void deposita(Evento evento) {
		this.conta.deposita(getValorOperacao(evento));
	}

	private double getValorOperacao(Evento evento) {
		return evento.getDouble("valorOperacao");
	}
}
