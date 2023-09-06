package treinoJunit;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import treinoJunit.main.modal.Cliente;

import static org.junit.jupiter.api.Assertions.*;


public class TesteCliente {

	public final Cliente CLIENTE = new Cliente("Thiago", 2000.0 , LocalDate.of(1999, 4, 22), "126.275.174-81");
	
	@Test
	public void testarObjetoCliente() {
		
	}
	
	/*
	 * Teste para validar vetores
	 * 
	 * O primeiro teste da errado de proposito para mostrar a situação de erro
	 * e o segundo é a forma esperada.
	 */
	@Test
	void validarVetores() {
		int [] a = {0,1,2};
		int [] b = {3};
		int [] ab = {0,1,2};
		
//		assertArrayEquals(a, b);
		assertArrayEquals(a, ab);
	}
}
