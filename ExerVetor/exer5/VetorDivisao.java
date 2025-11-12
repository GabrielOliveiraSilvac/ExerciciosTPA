
public class VetorDivisao {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i,b;
		
		System.out.println("Relação Entre Divisores");
		for(i=0;i<=10;i++) {
			System.out.println("Numero Do vetor: " +a[i]);
			
			for(b=1;b<=a[i];b++) {
				if(a[i] % b == 0) {
					System.out.println("Divisores: " +b);
				}


				
			}
		}

	}

}
