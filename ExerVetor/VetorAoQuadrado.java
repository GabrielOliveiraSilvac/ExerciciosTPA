import java.util.Scanner;
public class VetorAoQuadrado {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int a[], b[], c[],i;
		a = new int [TAM];
		b = new int [TAM];
		
		//Vetor A Leitura A
		System.out.println("Lendo o Vetor A:");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o valor de A;");
			a[i] = ler.nextInt();
		}
		//Vetor Ao Quadrado
		for(i=0;i<TAM;i++) {
			b[i] = a[i] * a[i]; 
		}
		System.out.print("\n");
		System.out.print("B = [ ");
		//Apresentar Vetor Ao Quadrado
		for(i=0;i<TAM;i++) {
			System.out.print(b[i]+ " ");
		}
		System.out.print("]");
		
		
		
	}

}
