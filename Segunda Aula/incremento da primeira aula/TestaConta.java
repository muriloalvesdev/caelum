public class TestaConta{
	public static void main(String args[]){

		Data data = new Data();
		data.setDia(21);
		data.setMes(1);
		data.setAno(2019);

		Conta contaMurilo = criarContaMurilo(data);
		Conta contaAdriana = criarContaAdriana(data);
		System.out.println("--------------");
		
		System.out.println("Identificador Murilo: " + contaMurilo.getIdentificador() + "\n");


		System.out.println("Identificador Adriana: " + contaAdriana.getIdentificador() + "\n");

		System.out.println("Dados Murilo: " + contaMurilo.recuperaDadosParaImpressao() + "\n");
		System.out.println("Dados Adriana: " + contaAdriana.recuperaDadosParaImpressao() + "\n");

	}

	private static Conta criarContaMurilo(Data data){
		Conta c = new Conta();
		c.setTitular("Murilo");
		c.setAgencia("123456-A");
		c.setNumero(123);
		c.deposita(10000);
		c.setDataDeAbertura(data);

		return c;
	}

	private static Conta criarContaAdriana(Data data){
		Conta c = new Conta("Adriana");
		c.setAgencia("123446-A");
		c.setNumero(1235);
		c.deposita(10009);
		c.setDataDeAbertura(data);

		return c;
	}
}
