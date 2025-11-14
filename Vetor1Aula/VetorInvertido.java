import java.util.Scanner;

public class VetorInvertido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		
		//Vetor Leitura A
		System.out.println("Lendo o Vetor A:");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+ " valor de A;");
			a[i] = ler.nextInt();
		}
		for(i=0;i<TAM;i++) {
			b[i] = a[TAM-1-i];
		}
		
		System.out.print("\n");
		System.out.print("B = [ ");
		//Vetor Ao Quadrado
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]");
		ler.close();
	}

}
