import java.util.Scanner;
public class VolumeCubo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double arestas,volume;
		
		System.out.println ("Digite a Medida das Arestas:");
		arestas = ler.nextDouble();
		
		volume = (arestas*arestas*arestas);
		System.out.println ("Seu Volume é:"+volume);

	}

}
