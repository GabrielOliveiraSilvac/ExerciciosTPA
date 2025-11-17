
public class VetorSomatorio {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i, b;
		
		System.out.println("Somatorio");
		for(i=0;i<a.length;i++) {
			System.out.println("Valor a ser somado: " +a[i]);
			int j=0;
		
			for(b=1;b<=a[i];b++) {
				j+=b;
				System.out.println("Somatorio de a: " +j);
			}
		}
		
		
		


	}
	
}
