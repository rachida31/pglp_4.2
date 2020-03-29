package uvsq.M1.td1.Exo4_2.exception;
/**
 * @author rachida ouchene
 * Exception renvoyée si la valeur est trop grande
 */
public class ExceptionMax extends  ArithmeticException {


	/**
	 * Constructeur de l'exception
	 */
	public ExceptionMax() {
		super(" \n Valeur absolue trop grande ");
	}

	
	
}
