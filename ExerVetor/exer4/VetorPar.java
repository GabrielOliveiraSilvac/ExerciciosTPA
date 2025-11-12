
public class VetorPar {

	public static void main(String[] args) {
		int a[] = {0, 3, 6, 7, 9, 10, 13, 16, 19, 25};
		int i, b;
		
		System.out.println("Caminho de Pares");
		for(i=0;i<=10;i++) {
			System.out.println("Numero Do vetor: " +a[i]);
			
			for(b=0;b<=a[i];b=b+2) {
				System.out.println("Sequência de números Pares: " +b);
				
			}
		}


	}

}
