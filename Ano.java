import java.util.Scanner;
public class Ano {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		double anoatual, nascimento, idade;
		
		System.out.println("Digite o ano atual:");
		anoatual= ler.nextDouble();
		
		System.out.println("digite seu ano de nacimento");
		nascimento= ler.nextDouble();
		
		idade=anoatual-nascimento;
		if (idade>=18) {
			System.out.println("Oc� � vei demais: "+idade);
		}
		ler.close();

	}

}
