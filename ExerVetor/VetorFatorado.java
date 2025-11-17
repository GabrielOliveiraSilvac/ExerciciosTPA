
public class VetorFatorado {
//verificar
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int b=1, i, c;
		
		System.out.println("Fatoração dos numeros");
		for(i=0;i<=a[i];i++) {
			System.out.println("Numero a ser fatorado: " +a[i]);
			
			for(c=1;c<=a[i];c++) {
				b = a[i] * c;
				System.out.println("Numero fatorado: " +b);
			}
		}


	}

}
