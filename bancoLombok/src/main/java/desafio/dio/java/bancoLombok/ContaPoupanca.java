package desafio.dio.java.bancoLombok;
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
	System.out.println("XXX Extrato Conta Poupan�a XXX");
	super.imprimirInformacoes();
	}
	
}
