package desafio.dio.java.bancoLombok;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws ParseException {
		Cliente mauricio = new Cliente();
		mauricio.setNome("Mauricio");
		
		ContaCorrente cc = new ContaCorrente(mauricio);
		cc.depositar(100);
		
		ContaPoupanca poupanca = new ContaPoupanca(mauricio);
		
		cc.transferir(100, poupanca);
		//Polimorfismo
		//IConta cc = new ContaCorrente():
		//IConta poupanca = new ContaPoupanca():
		//ou
		//ContaCorrente cc = new ContaCorrente():
		//ContaPoupanca poupanca = new ContaPoupanca():
		poupanca.solicitarCartao(poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
