package Interface;

public class Cliente implements Autenticacao {

	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		 this.autenticador = new AutenticacaoUtil();
		
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
		
	}

}
