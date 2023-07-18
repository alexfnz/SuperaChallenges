package br.com.alexfnz.superaChallenge;

import java.util.Scanner;

public class FourthSuperaChallenge {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de casos de teste: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
        	System.out.print("Informe a linha a ser decifrada: ");
            String linhaEmbaralhada = scanner.nextLine();
            String linhaDesembaralhada = desembaralhar(linhaEmbaralhada);
            System.out.println(linhaDesembaralhada);
        }
        
        scanner.close();
	}
	
	public static String desembaralhar(String linhaEmbaralhada) {
        int tam = linhaEmbaralhada.length();
        StringBuilder sb = new StringBuilder(tam);
        
        //percorre a metade direita da linha de tras pra frente
        for (int i = tam / 2 - 1; i >= 0; i--) {
            sb.append(linhaEmbaralhada.charAt(i));
        }
        
        //percorre a metade esquerda da linha de frente pra tras
        for (int i = tam - 1; i >= tam / 2; i--) {
            sb.append(linhaEmbaralhada.charAt(i));
        }
        
        return sb.toString();
    }
}