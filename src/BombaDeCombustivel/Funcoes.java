package BombaDeCombustivel;

import java.util.Scanner;

public class Funcoes {
	
	public String EscolhaTipoCombustivel() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor informe se você quer abastecer no Etanol "
				+ "ou Gasolina?");
		
		while(true) {
			
			System.out.println("1- Etanol");
			System.out.println("2- Gasolina");
			System.out.println("");
			System.out.printf("Digite sua opção:");
			String resposta = sc.nextLine();
			System.out.println("");
			
			switch(resposta.trim()) {
			  case "1":
				  return "ETANOL";
			  case "2":
				  return  "GASOLINA";
			  default:
				System.out.println("");
				System.out.println("Opção invalida por favor digite novamente...");
				System.out.println("");
			}
					
		}

	}

}
