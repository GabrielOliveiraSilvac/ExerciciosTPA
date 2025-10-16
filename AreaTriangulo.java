import java.util.Scanner;
public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double base,altura,area;
		
		System.out.println("Digite a base:");
		base = ler.nextDouble();
		
		System.out.println("Digite a altura:");
		altura = ler.nextDouble();
		
		area = (base*altura)/2;
		System.out.println("Sua area é:"+area);
			
		}

	}


