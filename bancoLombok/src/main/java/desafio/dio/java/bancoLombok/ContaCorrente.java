package desafio.dio.java.bancoLombok;
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override 
	public void  imprimirExtrato() {
		
		System.out.println("XXX Extrato Conta Corrente XXX");
		super.imprimirInformacoes();
		}

	
}
