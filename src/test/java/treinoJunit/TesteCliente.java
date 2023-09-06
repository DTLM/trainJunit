package treinoJunit;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import treinoJunit.main.modal.Cliente;

public class TesteCliente {

	public final Cliente CLIENTE = new Cliente("Thiago", 2000.0 , LocalDate.of(1999, 4, 22), "126.275.174-81");
	
	@Test
	public void testarObjetoCliente() {
		
	}
}
