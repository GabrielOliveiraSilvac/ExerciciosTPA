import java.util.Scanner;
public class Numero {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		int n;
		
		System.out.println("DIGITE O NUMERO ");
		n= ler.nextInt();
		
		if (n>=1) {
		    System.out.println("Seu numero � Positivo: "+n);
		}
		else if (n==0) {
			System.out.println("Seu numero � Neutro: "+n);
		}
		else {
			System.out.println("Seu numero � p� acesso Negado: "+n);
		}
		ler.close();
		}

	}


