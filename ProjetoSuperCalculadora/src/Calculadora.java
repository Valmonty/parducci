/*
 * Regras de neg�cio
 * a) receber duas vari�veis inteiras por parametro
 * b) somar as duas e devolver resultado
 * c) subtrair a segunda vari�vel do parametro
 *    pela primeira e desolver o resultado
 * d) multiplicar as duas vari�veis e devolver o resultado
 * e) dividir a segunda vari�vel do parametro pela
 *    primeira e devolver o resultado
 */

public class Calculadora {
	// atributo
	private int resultado = 0;

	// m�todo somar
	public int somar(int n1, int n2) {
		resultado = n1 + n2;
		return resultado;
	}

	// m�todo subtrair
	public int subtrair(int n1, int n2) {
		resultado = n2 - n1;
		return resultado;
	}

	// m�todo multiplicar
	public int multiplicar(int n1, int n2) {
		resultado = n1 * n2;
		return resultado;
	}

	// m�todo dividir
	public int dividir(int n1, int n2) {
		resultado = n2 / n1;
		return resultado;
	}
}