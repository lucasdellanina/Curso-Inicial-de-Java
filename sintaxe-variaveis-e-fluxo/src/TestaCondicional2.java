public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 15;
		int quantidadeDePessoas = 3;
		boolean acompanhado = quantidadeDePessoas >= 2;

		if (idade >= 18 && acompanhado) {
			System.out.println("voce foi preso pela lei meu chapa");
		} else {
			System.out.println("cai fora");
		}

	}
}
