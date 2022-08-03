package desafio.dio.java.bancoLombok;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class Banco {
	
	@Getter
	@Setter	
	public String nome;
	
	@Getter
	@Setter
	private List<Conta> contas;

	/*public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}*/
	
	
}
