import java.util.Scanner;
public class VetoresAVG {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		final int TAM = 10;
		int a[], media, i; 
		a = new int [TAM];
		media = 0;

		//Vetor A Leitura A
		System.out.println("Lendo o Vetor A:");
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+ " valor de A;");
			a[i] = ler.nextInt();
			media = a[i] + media;
			}
			media = media/TAM;
			System.out.println("A Média dos valores do Vetor A é " +media );
			ler.close();
	}
	
}