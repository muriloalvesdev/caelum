public class Conta{
	String titular;
	String agencia;
	int numero;
	double saldo;
	Data dataDeAbertura;

	void saca(double valor){
		this.saldo -= valor;
	}

	void deposita(double valor){
		this.saldo += valor;
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
