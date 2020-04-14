package Model;

public class Atividade {
	Desenvolvedor devPart; // desenvolvedor participante

	public Atividade(Desenvolvedor devPart) {
		this.devPart = devPart;
	}

	public class SubAtividade1 extends Atividade {
		private String tipo;
		private String dataInicio; // A DEFINIR SE É NECESSÁRIO
		private int TEMPO_EXECUCAO; // A DEFINIR

		public SubAtividade1(String tipo, Desenvolvedor devPart) {
			super(devPart);
			this.tipo = tipo;

		}

	}

	public class SubAtividade2 extends Atividade {
		private int TEMPO_EXECUCAO;

		public SubAtividade2(Desenvolvedor devPart) {
			super(devPart);
			// TODO Auto-generated constructor stub
		}

	}

	public class SubAtividade3 extends Atividade {
		private int TEMPO_EXECUCAO;

		public SubAtividade3(Desenvolvedor devPart) {
			super(devPart);
			// TODO Auto-generated constructor stub
		}

	}
}
