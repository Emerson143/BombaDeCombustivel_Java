package BombaDeCombustivel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Entidades.Bomba;
import Entidades.Veiculo;

public class Funcoes {

	int _somaEtanol = 0;
	int _somaGasolina = 0;
	
	public void ResumoGeraldasBombas() {
		
		Bomba bomba = new Bomba();
		
		
		System.out.println("*********************************************");
		System.out.println("*          Informações adicionais:          *");
		System.out.println(" Total abastecido na bomba 1 (GASOLINA): " + _somaGasolina + "Litros"); //1517 litros
		System.out.println(" Total abastecido na bomba 2 (ETANOL): "  + _somaEtanol + "Litros"); // 1125 litros");
		System.out.println(" Total geral abastecido das bombas: " +  (_somaEtanol + _somaGasolina ) ); //1517 litros");
		System.out.println(" Total gerado na bomba 1 (GASOLINA) R$: " + (_somaGasolina * bomba.getPrecoGasolina()));
		System.out.println(" Total gerado na bomba 2 (ETANOL) R$: " + (_somaEtanol * bomba.getPrecoEtanol()));
		System.out.println(" Lucro final  R$: " + ( (_somaGasolina * bomba.getPrecoGasolina()  ) + (_somaEtanol * bomba.getPrecoEtanol())));
		
		System.out.println();
	
		System.out.println("**********************************************");	
		
		
	}
	
	
	public void AbastecerVeiculosFila() {

		
		String tipoCombustivel;
		
		
		Dados dados = new Dados();
		ArrayList<Veiculo> listaVeiculos = dados.ListaVeiculos();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

		for (int i = 0; i < listaVeiculos.size(); i++) {
			System.out.println("===========================================");
			System.out.println("Veiculo da fila: " + listaVeiculos.get(i).getModelo() + " - Placa: "
					+ listaVeiculos.get(i).getPlaca());
			System.out.println("===========================================");
			System.out.println("");
			tipoCombustivel = EscolhaTipoCombustivel();
			System.out.println(
					"[" + dateFormat.format(new Date()) + "] Veículo modelo " + listaVeiculos.get(i).getModelo()
							+ ", placa " + listaVeiculos.get(i).getPlaca() + " foi abastecido com "
							+ listaVeiculos.get(i).getCapacidadeTaque() + " litros de " + tipoCombustivel);
			System.out.println("");
			
			if ( tipoCombustivel == "ETANOL") {
				
				_somaEtanol = _somaEtanol + listaVeiculos.get(i).getCapacidadeTaque();
				//System.out.println("ETANOL: " + _somaEtanol); só para testar 
				
			}
			if ( tipoCombustivel == "GASOLINA") {
				_somaGasolina = _somaGasolina + listaVeiculos.get(i).getCapacidadeTaque();
				//System.out.println("GASOLINA: " + _somaGasolina); só para testar 
			}
		}

	}
	
	public String EscolhaTipoCombustivel() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor informe se você o que deseja fazer");

		while (true) {

			System.out.println("1 - Etanol");
			System.out.println("2 - Gasolina");
			System.out.println("");
			System.out.printf("Digite sua opção: ");
			String resposta = sc.nextLine();
			System.out.println("");

			switch (resposta.trim()) {
			case "1":
				return "ETANOL";
			case "2":
				return "GASOLINA";
			default:
				System.out.println("");
				System.out.println("Opção invalida por favor digite novamente...");
				System.out.println("");
			}

		}

	}

}
