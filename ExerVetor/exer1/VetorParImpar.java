import java.util.Scanner;

public class VetorParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM = 20;
		int a[], b[],i;
		a = new int [TAM];
		b = new int [TAM];
		
		//Vetor Leitura A
		System.out.println("Lendo Vetor A");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o " +(i+1)+ " o valor de A;");
			a[i] = ler.nextInt();
		}
		//Separação de Valores Impar e Par B
		System.out.println("Valores Pares e Impares");
		System.out.print("\n");
		for(i=0;i<TAM;i++) {
			b[i] = a[i];
			if (b[i]%2==0) {
	            System.out.println("O numero é par: " +b[i]);
	        } else {
	            System.out.println("O numero é impar: " +b[i]);
	        }
			
		}
		ler.close();

	}

}
