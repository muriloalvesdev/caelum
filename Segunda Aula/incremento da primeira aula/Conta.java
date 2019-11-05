public class Conta{
	private String titular;
	private String agencia;
	private int numero;
	private double saldo;
	private Data dataDeAbertura;
	private static int quantidadeDeContas;
	private int identificador = quantidadeDeContas + 1;

	Conta(String titular){
		this();
		setTitular(titular);
	}
	
	Conta(){
		Conta.quantidadeDeContas++;
	}

	int getIdentificador(){
		return identificador;
	}

	void setTitular(String titular){
		this.titular = titular;
	}
	
	String getTitular(){
		return titular;
	}

	void setAgencia(String agencia){
		this.agencia = agencia;
	}

	String getAgencia(){
		return agencia;
	}

	void setNumero(int numero){
		this.numero = numero;
	}

	int getNumero(){
		return numero;
	}

	void setDataDeAbertura(Data dataDeAbertura){
		this.dataDeAbertura = dataDeAbertura;
	}

	void saca(double valor){
		this.saldo -= valor;
	}

	void deposita(double valor){
		this.saldo += valor;
	}

	double getSaldo(){
		return saldo;
	}

	double calculaRendimento(){
		return saldo * 0.1;
	}

	String recuperaDadosParaImpressao(){
		String dados = "Titular: " + this.titular;
		dados += "\nNúmero: " + this.numero;
		dados += "\nData de Abertura: " + this.dataDeAbertura.formatada();
		return dados;
	}


}
