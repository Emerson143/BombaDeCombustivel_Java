package Entidades;

public class Veiculo {
	
	private String Modelo;
	private String Placa;
	private double ConsumoEtanol;
	private double ConsumoGasolina;
	private int CapacidadeTaque;
	
	
	public Veiculo(String modelo, String placa, double consumoEtanol, double consumoGasolina, int capacidadeTaque) {
		
		this.Modelo = modelo;
		this.Placa = placa;
		ConsumoEtanol = consumoEtanol;
		ConsumoGasolina = consumoGasolina;
		CapacidadeTaque = capacidadeTaque;
	}
	

	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getPlaca() {
		return Placa;
	}


	public void setPlaca(String placa) {
		Placa = placa;
	}


	public double getConsumoEtanol() {
		return ConsumoEtanol;
	}


	public void setConsumoEtanol(double consumoEtanol) {
		ConsumoEtanol = consumoEtanol;
	}


	public double getConsumoGasolina() {
		return ConsumoGasolina;
	}


	public void setConsumoGasolina(double consumoGasolina) {
		ConsumoGasolina = consumoGasolina;
	}


	public int getCapacidadeTaque() {
		return CapacidadeTaque;
	}


	public void setCapacidadeTaque(int capacidadeTaque) {
		CapacidadeTaque = capacidadeTaque;
	}


}
