
public class VetorPotenciado {
//verificar
	public static void main(String[] args) {
		//corrigir fazer base * coeficiente, nao uma ´potencia normal!
		//talvez mandar assim mesmo
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
