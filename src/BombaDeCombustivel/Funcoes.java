package BombaDeCombustivel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Entidades.Bomba;
import Entidades.Veiculo;

public class Funcoes {

	
	public void ResumoGeraldasBombas() {
		 Bomba bomba = new Bomba();
		System.out.println("Total abastecido na bomba 1 (GASOLINA): "); //1517 litros
		System.out.println("Total abastecido na bomba 2 (ETANOL): "); // 1125 litros");
		System.out.println("Total geral abastecido de GASOLINA: "); //1517 litros");
		System.out.println("Total abastecido de ETANOL: " ); //1125 litros\"
		System.out.println();
		System.out.println("Informações adicionais:");
		System.out.println();
		System.out.println("O preço do litro da GASOLINA é R$ "+ bomba.getPrecoGasolina());
		System.out.println("O preço do litro do ETANOL é R$ " + bomba.getPrecoEtanol());	
	}
	
	
	
	public void AbastecerVeiculosFila() {

		Dados dados = new Dados();
		ArrayList<Veiculo> listaVeiculos = dados.ListaVeiculos();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

		for (int i = 0; i < listaVeiculos.size(); i++) {
			System.out.println("===========================================");
			System.out.println("Veiculo da fila: " + listaVeiculos.get(i).getModelo() + " - Placa: "
					+ listaVeiculos.get(i).getPlaca());
			System.out.println("===========================================");
			System.out.println("");

			System.out.println(
					"[" + dateFormat.format(new Date()) + "] Veículo modelo " + listaVeiculos.get(i).getModelo()
							+ ", placa " + listaVeiculos.get(i).getPlaca() + " foi abastecido com "
							+ listaVeiculos.get(i).getCapacidadeTaque() + " litros de " + EscolhaTipoCombustivel());
			System.out.println("");

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
