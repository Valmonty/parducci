/*
 * Regras de negócio
 * a) receber duas variáveis inteiras por parametro
 * b) somar as duas e devolver resultado
 * c) subtrair a segunda variável do parametro
 *    pela primeira e desolver o resultado
 * d) multiplicar as duas variáveis e devolver o resultado
 * e) dividir a segunda variável do parametro pela
 *    primeira e devolver o resultado
 */

public class Calculadora {
	// atributo
	private int resultado = 0;

	// método somar
	public int somar(int n1, int n2) {
		resultado = n1 + n2;
		return resultado;
	}

	// método subtrair
	public int subtrair(int n1, int n2) {
		resultado = n2 - n1;
		return resultado;
	}

	// método multiplicar
	public int multiplicar(int n1, int n2) {
		resultado = n1 * n2;
		return resultado;
	}

	// método dividir
	public int dividir(int n1, int n2) {
		resultado = n2 / n1;
		return resultado;
	}
}