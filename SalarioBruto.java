import java.util.Scanner;
public class SalarioBruto {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declara��o de variaveis
		double bruto,inss,vale,liquido;
		
		System.out.println ("Digite o Salario Bruto:");
		bruto = ler.nextDouble();
		
		inss = (bruto*8/100);
		vale = (bruto *6/100);
		liquido = (bruto-inss-vale);
		
		System.out.println ("Seu Salario Liquido �:"+liquido);
		
		
		

	}

}
