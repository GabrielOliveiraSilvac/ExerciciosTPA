import java.util.Scanner;
public class CalculeIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		double anoatual, anonascimento, idade;
		
		System.out.println("digite a data de hoje:");
		anoatual= ler.nextDouble();
		
		System.out.println("digite seu ano de nacimento");
		anonascimento= ler.nextDouble();
		
		idade=anoatual-anonascimento;
		
		System.out.println("voce tem "+idade+"  anos de idade seu idoso");
	}

}
