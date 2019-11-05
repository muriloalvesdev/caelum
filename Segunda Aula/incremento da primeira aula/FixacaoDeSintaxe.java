public class FixacaoDeSintaxe{

	public static void main(String[] args){
		imprimirTodosOsNumerosDe150A300();
		imprimirSomaDe1Ate1000();
		imprimaTodosOsMultiplosDe3Entre1And1000();
		imprimirFatoriaisDe1A10();
	}

	private static void imprimirTodosOsNumerosDe150A300(){
		System.out.println("Exibindo numeros de 150 a 300");		
		for(int x = 150 ; x <= 300 ; x++){
			System.out.println(x);
		}
		System.out.println("FIM dos numeros de 150 a 300");
	}

	private static void imprimirSomaDe1Ate1000(){
		int resultado = 0;

		System.out.println("Exibindo soma de 1 ate 1000");
		
		for(int x = 0 ; x <= 1000 ; x++){
			resultado = x + resultado;
			System.out.println(resultado);
		}
		System.out.println("FIM da soma de 1 ate 1000");
	}

	public static void 				imprimaTodosOsMultiplosDe3Entre1And1000(){
		for(int x = 0 ; x <= 1000 ; x++){
			if(x%3 == 0){
				System.out.println(x);
			}
		}
	}

	private static void imprimirFatoriaisDe1A10(){
		long fatorial = 1;
		for(int n = 1 ; n <= 10 ; n++){
			fatorial = fatorial * n;
			System.out.println(fatorial);
		}
	}
}
