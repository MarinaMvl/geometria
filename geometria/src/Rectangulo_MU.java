/**
 * 
 * @author Maryna Ulasava
 * @version 1.2
 *
 */


public class Rectangulo_MU extends FiguraGeometrica_MU {
	private double l1;
	private double l2;
	
	/**
	 * @el constructor de la clase Rectangulo_MU
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_MU(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * @return area - método area() que devuelve el area de un rectángulo
	 */
	
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * @return perimetro - el método perimetro() que devuelve el perimetro de un rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
