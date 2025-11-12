
public class VetorTabuada {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int b, i, c = 0;
		
		//Vetor A
		System.out.println("Tabuada de 5 Números Inteiros:");
		for(i=0;i<=5;i++) {
			System.out.println("\n");
			
			for(b=0;b<=10;b++) {
				c = a[i]*b;
				System.out.println(" Tabuada do " +(i+1)+ ": " + c );
			}
		}



	}

}
