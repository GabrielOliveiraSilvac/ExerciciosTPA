import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		int i=1,n; 
		int m = 1;
		System.out.println("Escreva seu numero");
		n = ler.nextInt();
		
		do {
			m = m * i;
			System.out.println("Seu numero de maneira fatorial " +m);
			i++;
		} while (i<=n);
		ler.close();

	}

}
