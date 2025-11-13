
public class VetorPrimos {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i,b;
		
		System.out.println("Numeros primos ou não:");
		for(i=0;i<=10;i++) {
			b=0;
			for(int j=1;j<=10;j++) {
			if(a[i]%j==0) {
				b++;
				}
			}
			if(b==2) {
				System.out.println("É primo: " +a[i]);
			}
			else {
				System.out.println("Não é primo: " +a[i]);
			}
		}

	}

}
