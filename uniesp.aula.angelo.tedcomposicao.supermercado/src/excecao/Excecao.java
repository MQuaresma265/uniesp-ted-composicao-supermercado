package excecao;

public class Excecao extends RuntimeException {
	//classe serializ�vel A, declare algo como o que esta abaixo e definindo que essa � a primeira vers�o "1L";
	private static final long serialVersionUID = 1L;
	
	public Excecao(String ErroExecucao) {
		super(ErroExecucao);
	}

}
