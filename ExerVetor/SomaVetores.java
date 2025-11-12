import java.util.Scanner;
public class SomaVetores{
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		final int TAM = 10;
		int a[], b[], c[],i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//Vetor A Leitura A
		System.out.println("Lendo o Vetor A:");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o valor de A;");
			a[i] = ler.nextInt();
		}
		//Vetor A Leitura B
		System.out.println("Lendo o Vetor B:");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o valor de B;");
			b[i] = ler.nextInt();
		}
		//Vetor A Leitura B
		for(i=0;i<TAM;i++) {
			c[i] = a[i] + b[i]; 
		}
		System.out.print("\n");
		System.out.print("C = [ ");
		//Vetor Ao Quadrado
		for(i=0;i<TAM;i++) {
			System.out.print(c[i]+ " ");
		}
		System.out.print("]");
		
		
		
	}

}
