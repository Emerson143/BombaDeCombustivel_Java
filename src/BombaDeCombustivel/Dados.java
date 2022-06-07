package BombaDeCombustivel;

import java.util.ArrayList;

import Entidades.Veiculo;

public class Dados {
	

	public ArrayList<Veiculo> ListaVeiculos() {
		
		ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();
		
		
		
		listaVeiculos.add(new Veiculo("FIAT-UNO", "JGG-7389", 8.9, 12.7, 48));
		listaVeiculos.add(new Veiculo("FORD-KA", "JGF-8573", 8.1, 11.6, 55));
		//listaVeiculos.add(new Veiculo("AUDI-A1", "JGE-0620", 0, 10.8, 45));
		//listaVeiculos.add(new Veiculo("CITROEN-C3", "JWM-1235", 7.5, 11.9, 47));
		//listaVeiculos.add(new Veiculo("RENAULT-CLIO", "KRM-6771", 7.5, 11.9, 47));
		//listaVeiculos.add(new Veiculo("AUDI-A1","JGE-4583", 0, 10.8, 45));
		//listaVeiculos.add(new Veiculo("FORD-KA", "JGE-9393", 8.1, 11.6, 55));
		//listaVeiculos.add(new Veiculo("RENAULT-CLIO", "JGE-0611", 7.5, 11.9, 47));
		//listaVeiculos.add(new Veiculo("CITROEN-C3", "JHM-7491",7.5, 11.9, 47));
		//listaVeiculos.add(new Veiculo("FORD-KA", "JGM-4773", 8.1, 11.6, 55));
		listaVeiculos.add(new Veiculo("AUDI-A4", "JMM-7513", 0, 8.8, 65));
		
		return listaVeiculos;
						
	}

}
