package BombaDeCombustivel;

import java.util.Scanner;

import Entidades.Bomba;

public class Programa {

	public static void main(String[] args) {

		Funcoes funcoes = new Funcoes();
		Scanner sc = new Scanner(System.in);
		Bomba bomba = new Bomba();
		Boolean laco = true;
		
		System.out.println("===========================================");
		System.out.println("=                                         =");
		System.out.println("=        SEJAM BEM VINDO AO POSTO!        =");
		System.out.println("=                                         =");
		System.out.println("===========================================");
		System.out.println();
			
		System.out.println("===========================================");
		System.out.println("=         PREÇO ETANOL R$: " +bomba.getPrecoEtanol( )+ "           =");
		System.out.println("===========================================");
		
		System.out.println("===========================================");
		System.out.println("=         PREÇO GASOLINA R$: " +bomba.getPrecoGasolina( )+ "          =");
		System.out.println("===========================================");
		
		while (laco) {
			
			System.out.println();
			System.out.println("******************************************");
			System.out.println("* 1 - Abastecer Veiculos da Fila         *");	
			System.out.println("* 2 - Incluir Novo veiculo               *");
			System.out.println("* 3 - Deletar Veiculo                    *");
			System.out.println("* 4 - Atualizar Dados Veiculo            *");
			System.out.println("* 5 - Resumo Geral das Bombas            *");
			System.out.println("******************************************");
			
			System.out.print("Digite sua opção: ");
			String resposta = sc.nextLine();
			System.out.println();
			
			switch ( resposta) {
			
			case "1" :
				funcoes.AbastecerVeiculosFila();
				//laco = false;
				break;
			case "2" :
				funcoes.IncluirVeiculo();
				break;
			case "3":
				funcoes.DeletarVeiculo();
				break;
			case "4":
				funcoes.AtualizarLista();
				break;
			case "5" : 
				funcoes.ResumoGeraldasBombas();
				//laco = false;
				break;	
			default:
				System.out.println("");
				System.out.println("Opção invalida por favor digite novamente...");
				System.out.println("");
				System.out.print("Digite sua opção: ");
				resposta = sc.nextLine();
				
			}
		}

	}
}