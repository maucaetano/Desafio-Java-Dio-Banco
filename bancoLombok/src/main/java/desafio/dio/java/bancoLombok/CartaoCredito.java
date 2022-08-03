package desafio.dio.java.bancoLombok;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

import lombok.Getter;
import lombok.Setter;

public class CartaoCredito {
	
	@Getter
	@Setter
	private Integer numeroCartao;
	
	@Getter
	@Setter
	private Date validade;
	
	@Getter
	@Setter
	private Integer codigoSeguranca;
	
	public CartaoCredito() throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Random random = new Random();
		
		this.numeroCartao = random.nextInt(16);
		this.codigoSeguranca = random.nextInt(3);
		this.validade = simpleDateFormat.parse("01/01/2030");
	}

	
}
