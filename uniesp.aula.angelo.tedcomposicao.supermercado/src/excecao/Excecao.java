package excecao;

public class Excecao extends RuntimeException {
	//classe serializável A, declare algo como o que esta abaixo e definindo que essa é a primeira versão "1L";
	private static final long serialVersionUID = 1L;
	
	public Excecao(String ErroExecucao) {
		super(ErroExecucao);
	}

}
