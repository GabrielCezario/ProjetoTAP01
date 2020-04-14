package Model;

import java.util.ArrayList;

public class Desenvolvedor {
	private ArrayList<Projeto> portfolio = new ArrayList<Projeto>();
	private String nome;
	private static int contCod = 1;
	private int cod;

	public Desenvolvedor(String nome, ArrayList<Projeto> portfolio) {
		this.nome = nome;
		this.portfolio = portfolio;
		this.cod = contCod;
		contCod++;
	}

	public class Junior extends Desenvolvedor { //A PENSAR EM MAIS ATRIBUTOS
		private final double DEV_SKILL = 0; // PENSO EM USAR ESSE ATRIBUTO COMO UM COEFICIENTE A UM TEMPO PRÉ DETERMINADO A TODOS

		public Junior(String nome, ArrayList<Projeto> portfolio) {
			super(nome,portfolio);
			// TODO Auto-generated constructor stub
		}

	}

	public class Pleno extends Desenvolvedor {
		private final double DEV_SKILL = 0;

		public Pleno(String nome, ArrayList<Projeto> portfolio) {
			super(nome, portfolio);

		}
	}

	public class Senior extends Desenvolvedor {
		private final double DEV_SKILL = 0;

		public Senior(String nome, ArrayList<Projeto> portfolio) {
			super(nome,portfolio);
			// TODO Auto-generated constructor stub
		}

	}
}
