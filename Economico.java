import java.util.Scanner;
public class Economico {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		double km, l, gasto;
		
		System.out.println("Escreva a Dist�ncia Percorrida em Quilometros: ");
		km= ler.nextDouble();
		
		System.out.println("Escreva a Capacidade do Tanque em Litros: ");
		l= ler.nextDouble();
		
		gasto=km/l;
		if (gasto>=10) {
			System.out.println("Seu consumo � Econ�mico");
		}
		else {
			System.out.println("Seu consumo N�o � Econ�mico");
		}
		ler.close();
		
	}

}
