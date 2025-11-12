import java.util.Scanner;
public class PrecoProduto {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		//declaração de variaveis
		double preco,quant,venda,lucro;
		
		System.out.println ("Digite o preço:");
		preco = ler.nextDouble();
		
		System.out.println ("Digite a Quantidade:");
		quant = ler.nextDouble();
		
		System.out.println ("Digite a Venda do produto:");
		venda = ler.nextDouble();
		
		lucro = (preco-venda*quant);
		
		System.out.println ("Seu Lucro foi de:"+lucro);

	}

}
