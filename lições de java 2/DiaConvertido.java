import java.util.Scanner;
public class DiaConvertido {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		int dia, ano, mes;
		
		System.out.println ("Digite o dia:");
		dia = ler.nextInt();
		
		mes = (dia/30);
		ano = (dia/365);
		System.out.println ("seu mes é:"+mes);
		System.out.println ("Seu Ano é:"+ano);
		
		

	}

}
