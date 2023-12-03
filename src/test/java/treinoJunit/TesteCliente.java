package treinoJunit;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import treinoJunit.main.modal.Cliente;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

/**
 * classe com exemplos de testes e como usar
 * @author Thiago Leal Martins
 *
 */

// anota��o para ordernar a execu��o dos testes
// outro metodo de ordena��o OrderAnnotation.class
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class TesteCliente {

	public final Cliente CLIENTE = new Cliente("Thiago", 2000.0 , LocalDate.of(1999, 4, 22), "126.275.174-81");
	
	/**
	 * Teste de valores nulos e n�o nulos
	 */
	@DisplayName("A")
	@Order(value = 1)
	@Test
	void testarObjetoCliente() {
		Cliente cliente = null;
		assertNull(cliente);
		assertNotNull(CLIENTE);
	}
	
	/*
	 * Teste para validar vetores
	 * 
	 * O primeiro teste est� dando certo porque o endere�o das variaveis s�o diferentes
	 * e o segundo � a forma esperada.
	 */
	@DisplayName("B")
	@Order(2)
	@Test
	void validarVetores() {
		int [] a = {0,1,2};
		int [] b = {3};
		int [] ab = {0,1,2};
		
		assertNotEquals(a, ab);
		assertArrayEquals(a, ab);
	}
	
	/**
	 * teste de compara��o entre dois numeros
	 */
	@Order(3)
	@Test
	void testeBasico() {
		double valor1 = 5.0;
		double valor2 = 5.0;
		assertEquals(valor1, valor2);
	}
	
	
	/**
	 * Os seguintes testes s�o testes que ocorrem antes de tudo e 
	 * cada vez que um teste for executado.
	 * 
	 * No caso dos que acontecem antes e depois de tudo, � necessario que sejam metodos staticos
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
	
	
	/**
	 * Testes com condicionais s�o necessarios utilizar a classe Assumptions
	 * que � o ato de assumir que algo est� certo ou errado, como um if.
	 * Se a assun��o estiver correta, continua sen�o da um erro.
	 * Existem outros testes como para rodar s� se o sistema operacional for um determinado ou n�o for o selecionado (para melhor entendimento olhe
	 * o codigo).
	 */
	@Order(4)
	@Test
	void testeComCondicionais() {
		assumeTrue(5+5 == 10);
		System.out.println("verdadeiro");
	}
	
	@Order(5)
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testeComOs() {
		System.out.println("esse teste s� � executado no windows");
	}
	
	/**
	 * teste de condi��o, sempre em string
	 */
	public boolean teste() {
		return true;
	}
	@Order(6)
	@Test
	@EnabledIf(value = "teste")
	void testesComIfAnotacao() {
		System.out.println("entrei if");
	}
	
	/**
	 * teste de exce��es, melhor forma utilizando lambda
	 */
	@Order(7)
	@Test
	void testeDeExcecao() {
		assertThrows(Exception.class, () -> 
		testeParaExcecao());
	}
	
	boolean testeParaExcecao() throws Exception {
		assumeTrue(System.getenv("USER") != null);
		throw new Exception();
	}
}
