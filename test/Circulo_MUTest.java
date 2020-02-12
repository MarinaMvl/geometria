import static org.junit.Assert.*;


import org.junit.Test;

public class Circulo_MUTest {
	
	Circulo_MU circ7=new Circulo_MU(7,"Circulo");
	Circulo_MU circ0=new Circulo_MU(0,"Circulo");
	Circulo_MU circ3=new Circulo_MU(-3,"Circulo");
	

	@Test
	public void testArea() {
		
		double res=circ7.area();
		assertEquals(153.9384,res,0.0001);
		
		
		double res1=circ0.area();
		assertEquals(0,res1,0.0001);
		
		
		double res2=circ3.area();
		assertEquals(28.2744,res2,0.0001);
		
		
	}

	@Test
	public void testPerimetro() {
		
		double res=circ7.perimetro();
		assertEquals(43.9824,res,0.0001);
		
		
		double res1=circ0.perimetro();
		assertEquals(0,res1,0.0001);
		
		
		double res2=circ3.perimetro();
		assertEquals(18.8496,res2,0.0001);
		
		
	}

}
