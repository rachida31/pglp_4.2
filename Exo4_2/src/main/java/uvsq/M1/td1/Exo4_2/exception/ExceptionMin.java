package uvsq.M1.td1.Exo4_2.exception;
/**
 * @author rachida ouchene
 * Exception renvoyée si la valeur est trop petite
 */
public class ExceptionMin extends  ArithmeticException{
	/**
	 * Constructeur de l'exception
	 */
	public ExceptionMin() {
		super("Valeur absolue trop petite");
	}

}
