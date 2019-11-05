public class BalancoTrimestral{

	public static void main(String[] args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		System.out.println("O valor total gasto no trimestre foi: " + gastosTrimestre);

		double mediaGastoTrimestre = gastosTrimestre / 3;
		System.out.println("A media do gasto trimestral é de: " + mediaGastoTrimestre);

	}
}
