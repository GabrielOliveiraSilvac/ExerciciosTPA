
import java.util.Arrays;
import java.util.Scanner;

public class RotinadeBusca {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int a[],i, n;
		a = new int [TAM];
		
		//Vetor Leitura A
		System.out.println("Lendo o Vetor A:");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+" o valor de A;");
			a[i] = ler.nextInt();
			
		}
		//Rotina de Busca
		System.out.println("Escreva o valor a ser procurado");
		n = ler.nextInt();
		int p = Arrays.binarySearch(a, n);
		System.out.println("O Valor achado está na Posição" +p);
		ler.close();
	}
	
}