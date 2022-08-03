package desafio.dio.java.bancoLombok;
import java.text.ParseException;

import lombok.Getter;
import lombok.Setter;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
    
	@Getter
    
	protected int agencia;
    
    @Getter
    
    protected int numero;
    
    @Getter
    
    protected double saldo;
    
    @Getter
    
    private Cliente cliente;
    
    @Getter
    @Setter
    private CartaoCredito cartaoCredito;
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
		
	public void solicitarCartao(Conta conta) throws ParseException {
		
			CartaoCredito cartaoCredito = new CartaoCredito();
			conta.setCartaoCredito(cartaoCredito);
			
			System.out.println("Cart�o de Cr�dito solicitado com sucesso!");
		
	};

	protected void imprimirInformacoes() {
		
		System.out.println("Titular:" + this.cliente.getNome());
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("Cart�o de cr�dito: " + this.getCartaoCredito());
		
	}
	
	
	
	

	
}
