package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
		int idade = 15;
		int acompanhado = 0;
		boolean criarConta = acompanhado >= 1;
		
		if (idade >= 18 || criarConta) {
			System.out.println("Você pode criar conta");
		} else {
			System.out.println("Apenas maior de idade ou acompanhado pode criar conta no banco");
		}
	}
		
}
