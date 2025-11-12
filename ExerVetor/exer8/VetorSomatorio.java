
public class VetorSomatorio {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i, b, j=0;
		
		System.out.println("Somatorio");
		for(i=0;i<=10;i++) {
			System.out.println("Valor a ser somado: " +a[i]);
			b=j+a[i];
			for(b=0;b<=a[i];b++) {
				System.out.println("Somatorio de a: " +b);
				
			}
		}


	}
	
}
