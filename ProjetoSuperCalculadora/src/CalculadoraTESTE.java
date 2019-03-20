import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTESTE {

	/**
	 * Teste de somar na Calculadora.
	 */
	@Test
	public void testeSomar() {
		int nro1 = 5;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 10;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	 * Teste de subtrair na Calculadora.
	 */
	@Test
	public void testeSubtrair() {
		int nro1 = 3;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 2;
		int resultadoReal = calc.subtrair(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	/**
	 * Teste de multiplicar na Calculadora.
	 */
	@Test
	public void testeMultiplicar() {
		int nro1 = 3;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 15;
		int resultadoReal = calc.multiplicar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	/**
	 * Teste de divir na Calculadora.
	 */
	@Test
	public void testeDividir() {
		int nro1 = 5;
		int nro2 = 10;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 2;
		int resultadoReal = calc.dividir(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
