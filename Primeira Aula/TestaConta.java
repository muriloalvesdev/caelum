public class TestaConta{
	public static void main(String args[]){

		Data data = new Data();
		data.dia = 21;
		data.mes = 1;
		data.ano = 2019;

		Conta contaMurilo = criarContaMurilo(data);
		Conta contaMurilo2 = criarContaMurilo(data);
		
		comparandoAsClasses(contaMurilo, contaMurilo2);
		String dados = contaMurilo.recuperaDadosParaImpressao();
		System.out.println(dados);
	}

	private static void comparandoAsClasses(Conta contaMurilo, Conta contaMurilo2){
		if(contaMurilo == contaMurilo2){
			System.out.println("Iguais");
		}else{
			System.out.println("Diferentes");
		}
	}

	private static Conta criarContaMurilo(Data data){
		Conta c = new Conta();
		c.titular = "Murilo";
		c.agencia = "123456-A";
		c.numero = 123;
		c.saldo = 10000;
		c.dataDeAbertura = data;

		return c;
	}
}
