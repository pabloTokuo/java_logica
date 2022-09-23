package sintaxe_variaveis_e_fluxo;

public class TestaCondicional {
	
		public static void main(String[] args) {
			int idade = 18;
			if (idade >= 18) {
				System.out.println("Você pode votar e ser preso");
			} else if (idade >= 16) {
				System.out.println("Você pode votar mas não pode ser preso");
			} else {
				System.out.println("Você não pode votar e nem ser preso");
			}
		}
}
