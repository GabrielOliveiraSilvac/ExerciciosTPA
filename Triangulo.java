import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		double a, b, c;
		
		System.out.println("Digite o valor de A");
		a=ler.nextDouble();
		
		System.out.println("Digite o valor de B");
		b=ler.nextDouble();
		
		System.out.println("Digite o valor de C");
		c=ler.nextDouble();
		
		if (a<b+c && b<a+c && c<a+b) {
			
			if (a==b && b==c) {
				 System.out.println("Tri�ngulo Equil�tero:");
            } else if (a!=b && b!=c && a !=c) {
                System.out.println("Tri�ngulo Escaleno: ");
            } else {
                System.out.println("Tri�ngulo Is�sceles:");
            }

        } else {
            System.out.println("Os valores informados N�O formam um tri�ngulo.");
        }
		ler.close();
			}
	

		

	}


