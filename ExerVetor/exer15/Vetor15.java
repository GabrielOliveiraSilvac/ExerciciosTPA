
public class Vetor15 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		int b[] = {2,3,1,4,5,10,6,7,9,2};
		int c[]	= new int [10];	
		int i;
		
		//Separação de Valores Impar e Par A
		System.out.println("Valores Pares e Impares");
		System.out.print("\n");
		for(i=0;i<a[i];i++) {
			if (a[i]>b[i]) {
				c[i] = 1;
	            System.out.println("Quando A for Maior que B: " +c[i]);
	            
	        }if(a[i]==b[i]) {
	        	c[i]=0;
	            System.out.println("Quando A for Igual a B: " +c[i]);
	            
	        }
	        else {
	        	c[i] = 1;
	        	System.out.println("Quando A for Menor que B: -" +c[i] );
	        	
	        	
	        }
			
		}
		

	}

}
