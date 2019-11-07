package br.com.caelum.contas.exception;

public class SaldoInsuficienteException extends Exception {

	private static final long serialVersionUID = 5134200363607734362L;

	public SaldoInsuficienteException(String message) {
		super(message);
	}

}
