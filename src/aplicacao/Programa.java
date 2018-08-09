package aplicacao;

import java.util.Scanner;

import servicos.BrasilInteresseServico;
import servicos.EstadoUnidosInteresseServico;
import servicos.InteresseServico;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double dQuantia = sc.nextDouble();
		System.out.print("Meses: ");
		int iMeses = sc.nextInt();
		
		InteresseServico brasil = new BrasilInteresseServico(2.0);
		double dPagamento = brasil.dPagamento(dQuantia, iMeses);
		
		System.out.println("\nPagar no Brasil depois de " + iMeses + " Meses.");
		System.out.println(String.format("%.2f", dPagamento) + "\n");
		
		InteresseServico eua = new EstadoUnidosInteresseServico(1.0);
		double dPagamento1 = eua.dPagamento(dQuantia, iMeses);
		
		System.out.println("Pagar no Estados Unidos depois de " + iMeses + " Meses.");
		System.out.println(String.format("%.2f", dPagamento1));
		sc.close();
		
	}

}
