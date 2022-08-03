package desafio.dio.java.bancoLombok;
import java.text.ParseException;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
	
	void solicitarCartao(Conta conta) throws ParseException;
}
