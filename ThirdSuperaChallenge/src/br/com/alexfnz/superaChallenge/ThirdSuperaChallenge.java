package br.com.alexfnz.superaChallenge;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ThirdSuperaChallenge {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do array: ");
        int n = sc.nextInt();

        System.out.println("Informe o valor alvo: ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Informe os numeros do array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = contarParesComDiferenca(arr, k);
        System.out.println("Numero de pares: " + count);
	}
	
	public static int contarParesComDiferenca(int[] arr, int k) {
        // Converte o array em um conjunto para facilitar a verificação de elementos
        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int count = 0;
        for (int num : arr) {
            // Verifica se existe um par cuja diferença seja igual a k
            if (numSet.contains(num + k)) {
                count++;
            }
        }

        return count;
    }
}