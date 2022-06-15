package BombaDeCombustivel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Bomba;
import Entidades.Veiculo;

public class Funcoes {

	int _somaEtanol = 0;
	int _somaGasolina = 0;
	Dados _dados = new Dados();
	ArrayList<Veiculo> _listaVeiculos = _dados.ListaVeiculos();

	public void ResumoGeraldasBombas() {

		Bomba bomba = new Bomba();

		System.out.println("*********************************************");
		System.out.println("*          Informações adicionais:          *");
		System.out.println(" Total abastecido na bomba 1 (GASOLINA): " + _somaGasolina + "Litros"); // 1517 litros
		System.out.println(" Total abastecido na bomba 2 (ETANOL): " + _somaEtanol + "Litros"); // 1125 litros");
		System.out.println(" Total geral abastecido das bombas: " + (_somaEtanol + _somaGasolina)); // 1517 litros");
		System.out.println(" Total gerado na bomba 1 (GASOLINA) R$: " + (_somaGasolina * bomba.getPrecoGasolina()));
		System.out.println(" Total gerado na bomba 2 (ETANOL) R$: " + (_somaEtanol * bomba.getPrecoEtanol()));
		System.out.println(" Lucro final  R$: "
				+ ((_somaGasolina * bomba.getPrecoGasolina()) + (_somaEtanol * bomba.getPrecoEtanol())));

		System.out.println();

		System.out.println("**********************************************");

	}

	public void IncluirVeiculo() {

		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("=          ADICIONAR VEICULOS             =");
		System.out.println("===========================================");

		ListarVeiculo();
		System.out.println("Deseja incluir novo veiculo? ");

		while (true) {

			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.println("");
			System.out.printf("Digite sua opção: ");
			String resposta = sc.nextLine();
			System.out.println("");

			switch (resposta.trim()) {
			case "1":
				SalvarVeiculo();
				return;

			case "2":
				return;
			default:
				System.out.println("");
				System.out.println("Opção invalida por favor digite novamente...");
				System.out.println("");
			}
		}
	}

	public void SalvarVeiculo() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String modelo;
		String placa;
		double consumoEtanol;
		double consumoGasolina;
		int capacidadeTaque;
		System.out.printf("Digite seu modelo(MARCA-MODELO): ");
		modelo = sc.nextLine();
		System.out.printf("Digite sua placa(AAA-0000): ");
		placa = sc.nextLine();
		System.out.printf("Digite seu consumo de etanol(14.5): ");
		consumoEtanol = sc.nextDouble();
		System.out.printf("Digite seu consumo de gasolina(12.5): ");
		consumoGasolina = sc.nextDouble();
		System.out.printf("Digite sua capacidade do seu tanque Litros(48): ");
		capacidadeTaque = sc.nextInt();

		_listaVeiculos.add(new Veiculo(modelo, placa, consumoEtanol, consumoGasolina, capacidadeTaque));
		System.out.println();
		System.out.printf("Veiculo cadastrado com sucesso! ");
		System.out.println();
	}

	public void DeletarVeiculo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("=          DELETAR VEICULOS               =");
		System.out.println("===========================================");

		ListarVeiculo();
		System.out.println("Deseja deletar veiculo? ");

		while (true) {

			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.println("");
			System.out.printf("Digite sua opção: ");
			String resposta = sc.nextLine();
			System.out.println("");

			switch (resposta.trim()) {
			case "1":

				ApagarVeiculo();
				return;

			case "2":
				return;
			default:
				System.out.println("");
				System.out.println("Opção invalida por favor digite novamente...");
				System.out.println("");
			}
		}
	}

	public void ApagarVeiculo() {
		Scanner sc = new Scanner(System.in);
		System.out.println();

		System.out.println("Digite o codico do veiculo que deseja apagar?");
		int codigo = sc.nextInt();
		_listaVeiculos.remove(codigo);

		System.out.println();
		System.out.printf("Veiculo deletado com sucesso! ");
		System.out.println();
	}

	public void AtualizarLista() {

		Scanner sc = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.println("=          ATUALIZAR VEICULOS              =");
		System.out.println("===========================================");

		ListarVeiculo();
		System.out.println("Deseja atualizar veiculo? ");

		while (true) {

			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			System.out.println("");
			System.out.printf("Digite sua opção: ");
			String resposta = sc.nextLine();
			System.out.println("");

			switch (resposta.trim()) {
			case "1":

				AtualizarVeiculo();
				return;

			case "2":
				return;
			default:
				System.out.println("");
				System.out.println("Opção invalida por favor digite novamente...");
				System.out.println("");

			}
		}
	}

	public void AtualizarVeiculo() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println();

		System.out.println("Digite o codigo do veiculo que deseja atualizar?");
		int codigo = sc.nextInt();
		
		String modelo;
		String placa;
		double consumoEtanol;
		double consumoGasolina;
		int capacidadeTaque;
		
		System.out.printf("Digite o modelo(atual: " + _listaVeiculos.get(codigo).getModelo() +"): ");
		modelo = sc.next();
		//sc.nextLine();
		System.out.printf("Digite sua placa(atual: "+ _listaVeiculos.get(codigo).getPlaca()+"): ");
		placa = sc.next();
		System.out.printf("Digite seu consumo de etanol(atual: " + _listaVeiculos.get(codigo).getConsumoEtanol()+"): ");
		consumoEtanol = sc.nextDouble();
		System.out.printf("Digite seu consumo de gasolina(atual: "+ _listaVeiculos.get(codigo).getConsumoGasolina()+"): ");
		consumoGasolina = sc.nextDouble();
		System.out.printf("Digite sua capacidade do seu tanque Litros(atual: "+ _listaVeiculos.get(codigo).getCapacidadeTaque()+"): ");
		capacidadeTaque = sc.nextInt();
		
		_listaVeiculos.get(codigo).setModelo(modelo);
		_listaVeiculos.get(codigo).setPlaca(placa);;
		_listaVeiculos.get(codigo).setConsumoEtanol(consumoEtanol);
		_listaVeiculos.get(codigo).setConsumoGasolina(consumoGasolina);
		_listaVeiculos.get(codigo).setCapacidadeTaque(capacidadeTaque);

		System.out.println();
		System.out.printf("Veiculo atualizado com sucesso! ");
		System.out.println();

	}

	public void ListarVeiculo() {

		System.out.println("===========================================");
		System.out.println("=CODIGO           VEICULO          PLACA  =");
		System.out.println("===========================================");

		for (int i = 0; i < _listaVeiculos.size(); i++) {
			System.out.println(+i + " " + "              " + _listaVeiculos.get(i).getModelo() + "           "
					+ _listaVeiculos.get(i).getPlaca());

		}

		System.out.println("===========================================");
		System.out.println();
	}

	public void AbastecerVeiculosFila() {

		String tipoCombustivel;

		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

		for (int i = 0; i < _listaVeiculos.size(); i++) {
			System.out.println("===========================================");
			System.out.println("Veiculo da fila: " + _listaVeiculos.get(i).getModelo() + " - Placa: "
					+ _listaVeiculos.get(i).getPlaca());
			System.out.println("===========================================");
			System.out.println("");
			tipoCombustivel = EscolhaTipoCombustivel();
			System.out.println(
					"[" + dateFormat.format(new Date()) + "] Veículo modelo " + _listaVeiculos.get(i).getModelo()
							+ ", placa " + _listaVeiculos.get(i).getPlaca() + " foi abastecido com "
							+ _listaVeiculos.get(i).getCapacidadeTaque() + " litros de " + tipoCombustivel);
			System.out.println("");

			if (tipoCombustivel == "ETANOL") {

				_somaEtanol = _somaEtanol + _listaVeiculos.get(i).getCapacidadeTaque();
				// System.out.println("ETANOL: " + _somaEtanol); só para testar

			}
			if (tipoCombustivel == "GASOLINA") {
				_somaGasolina = _somaGasolina + _listaVeiculos.get(i).getCapacidadeTaque();
				// System.out.println("GASOLINA: " + _somaGasolina); só para testar
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
