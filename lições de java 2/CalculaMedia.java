import java.util.Scanner;
public class CalculaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ler = new Scanner(System.in);
		//declaração de variaveis
		double nota1,nota2,media;
		
		System.out.println ("Digite a 1a nota:");
		nota1= Ler.nextDouble ();
		
		System.out.println ("Digite a 2a nota:");
		nota2=Ler.nextDouble ();
		
		media= (nota1+nota2)/2;
		System.out.println ("Sua media é=" +media);
	}

}
