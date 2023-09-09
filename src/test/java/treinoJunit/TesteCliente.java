package treinoJunit;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import treinoJunit.main.modal.Cliente;

import static org.junit.jupiter.api.Assertions.*;


public class TesteCliente {

	public final Cliente CLIENTE = new Cliente("Thiago", 2000.0 , LocalDate.of(1999, 4, 22), "126.275.174-81");
	
	/**
	 * Teste de valores nulos e não nulos
	 */
	@Test
	void testarObjetoCliente() {
		Cliente cliente = null;
		assertNull(cliente);
		assertNotNull(CLIENTE);
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
		
		assertNotEquals(a, b);
		assertArrayEquals(a, ab);
	}
	
	/**
	 * teste de comparação entre dois numeros
	 */
	@Test
	void testeBasico() {
		double valor1 = 5.0;
		double valor2 = 5.0;
		assertEquals(valor1, valor2);
	}
	
	
	/**
	 * Os seguintes testes são testes que ocorrem antes de tudo e 
	 * cada vez que um teste for executado.
	 * 
	 * No caso dos que acontecem antes e depois de tudo, é necessario que sejam metodos staticos
	 */
	@BeforeAll
	static void antesDeTodos() {
		System.out.println("inicializando.");
	}
	
	@BeforeEach
	void antesDeCada() {
		System.out.println("inicializando antes de cada");
	}
	
	@AfterAll
	static void depoissDetoos() {
		System.out.println("finalizando.");
	}
	
	@AfterEach
	void depoisDeCada() {
		System.out.println("finalizando antes de cada");
	}
}
