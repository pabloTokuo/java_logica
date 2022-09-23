package sintaxe_variaveis_e_fluxo;

public class TestaLacos {

	
	public static void main(String[] args) {
		for(int multiplicador = 0; multiplicador <= 10; multiplicador++) { 
			// multiplicador vai contar o mesmo numero por 10x e depois avancar ex : 0 10x e dps avanca para o 1 e assim por diante
			for (int contador = 0; contador <= 10; contador++) { // contador vai contar de 1 a 10 por 10x por estar dentro de outro for
				System.out.print(multiplicador * contador);
				System.out.print(" "); // espaço entre os numeros 
			}
			System.out.println(); // LN serve para pular linha
		}
	}

	
}
