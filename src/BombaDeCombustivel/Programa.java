package BombaDeCombustivel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Entidades.Veiculo;

public class Programa {

	public static void main(String[] args) {

		Funcoes funcoes = new Funcoes();
		Dados dados = new Dados();
		ArrayList<Veiculo> listaVeiculos = dados.ListaVeiculos();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

		
		System.out.println("===========================================");
		System.out.println("=                                         =");
		System.out.println("=        SEJAM BEM VINDO AO POSTO!        =");
		System.out.println("=                                         =");
		System.out.println("===========================================");
		System.out.println();

		for (int i = 0; i < listaVeiculos.size(); i++) {
			System.out.println("===========================================");
			System.out.println("Veiculo da fila: " + listaVeiculos.get(i).getModelo() + " - Placa: "
					+ listaVeiculos.get(i).getPlaca());
			System.out.println("===========================================");
			System.out.println("");
			
			System.out.println("["+dateFormat.format( new Date() )+ "] Veículo modelo " + listaVeiculos.get(i).getModelo() + ", placa "
					+ listaVeiculos.get(i).getPlaca() + " foi abastecido com "
					+ listaVeiculos.get(i).getCapacidadeTaque() + " litros de " + funcoes.EscolhaTipoCombustivel());
			System.out.println("");

		}

	}

}
