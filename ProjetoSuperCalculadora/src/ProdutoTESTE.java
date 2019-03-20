import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ProdutoTESTE {

	@Test
	void testGetAltura() {
	
		Produto p1 = new Produto(10 , 50);
		
		double resultAltura = p1.getAltura();
		
		assertEquals(10, resultAltura);
		
	}
	
	

}
