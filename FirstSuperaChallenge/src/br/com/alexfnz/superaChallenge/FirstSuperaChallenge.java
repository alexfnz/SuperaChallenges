package br.com.alexfnz.superaChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FirstSuperaChallenge {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe os numeros: ");
        int n = scanner.nextInt();
        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            valores.add(valor);
        }

        List<Integer> valoresOrdenados = ordenarParesImpares(valores);

        for (int valor : valoresOrdenados) {
            System.out.println(valor);
        }
	}
	
	private static List<Integer> ordenarParesImpares(List<Integer> valores) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        pares.addAll(impares);
        return pares;
    }
}