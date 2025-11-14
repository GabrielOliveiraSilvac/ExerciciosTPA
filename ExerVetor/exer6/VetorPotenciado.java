
public class VetorPotenciado {

	public static void main(String[] args) {
		int a[] = {0,1,2,3,4,5,6,7,8,9,10};
		int i, c = 1;
		
		System.out.println("Transformando em versão de Potência " );
		for(i=0;i<=a[i];i++) {
			System.out.print("Numero: " +a[i]);
			a[i] = c*i*a[i];
			System.out.println(" Potência: " +a[i]);
		}
		

	}

}

