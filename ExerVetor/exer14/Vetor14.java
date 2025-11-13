
public class Vetor14 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = new int [10];
		int i;
		
		//Separação de Valores Impar e Par A
		System.out.println("Valores Pares e Impares");
		System.out.print("\n");
		for(i=0;i<=10;i++) {
			if (a[i]%2==0) {
	            System.out.println("O numero do Vetor A é par: " +a[i]);
	            b[i]=+1;
	        } else {
	            System.out.println("O numero do Vetor A é impar: " +a[i]);b[i]=+1;
	            b[i]=+0;
	        }
			System.out.println("Vetor B Recebe: " +b[i]);
		}
		

	}

}
