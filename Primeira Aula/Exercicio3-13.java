public class FixacaoDeSintaxe{

	public static void main(String[] args){
		//imprimirTodosOsNumerosDe150A300();
		imprimirSomaDe1Ate1000();
	}

	private static void imprimirTodosOsNumerosDe150A300(){
		System.out.println("Exibindo numeros de 150 a 300");		
		for(int x = 150 ; x <= 300 ; x++){
			System.out.println(x);
		}
	}

	private static void imprimirSomaDe1Ate1000(){
		int resultado = 0;
		int ultimoValor = 0;

		System.out.println("Exibindo soma de 1 ate 1000");
		
		for(int x = 0 ; x <= 1000 ; x++){
			resultado = x + resultado;
			System.out.println(ultimoValor + resultado);
		}
		System.out.println("FIM");
	}
}
