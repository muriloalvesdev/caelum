package br.com.caelum.contas.modelo;

import br.com.caelum.contas.exception.SaldoInsuficienteException;

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private String titular;
	private int numero;
	private String agencia;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	public abstract String getTipo();

	@Override
	public int compareTo(Conta conta) {
		return this.titular.compareTo(conta.titular);
	}

//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return false;
//		}
//		Conta outraConta = (Conta) obj;
//		return this.numero == outraConta.numero && this.agencia.equals(outraConta.getAgencia());
//	}

	public void transfere(double valor, Conta conta) throws SaldoInsuficienteException {
		this.saca(valor);
		conta.deposita(valor);
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void deposita(double valor) throws SaldoInsuficienteException {
		if (valor < 0) {
			throw new SaldoInsuficienteException("Você tentou depositar um valor negativo!");
		} else {
			this.saldo += valor;
		}
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "]";
	}

}
