package br.com.alexfnz.superaChallenge;

import java.util.Scanner;

public class SecondSuperaChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("Digite o valor(Exemplo 576,73): ");
        double valor = scanner.nextDouble(); // Lê o valor de ponto flutuante
        
        // Converte o valor para centavos e arredonda para duas casas decimais
        int centavos = (int) (valor * 100);
        
        // Inicializa a lista de notas e moedas possíveis
        int[] notasMoedas = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };
        
        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            int quantidade = centavos / notasMoedas[i];
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, notasMoedas[i] / 100.0);
            centavos %= notasMoedas[i];
        }
        
        System.out.println("MOEDAS:");
        for (int i = 6; i < notasMoedas.length; i++) {
            int quantidade = centavos / notasMoedas[i];
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, notasMoedas[i] / 100.0);
            centavos %= notasMoedas[i];
        }
        
        scanner.close();

	}
}