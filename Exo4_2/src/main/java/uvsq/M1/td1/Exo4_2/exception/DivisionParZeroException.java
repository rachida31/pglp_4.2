package uvsq.M1.td1.Exo4_2.exception;

/**
 * Exception a cause de la division par zéro.
 * @date 28/03/2020.
 * @author ouchene rachida.
 * 
 */
public class DivisionParZeroException extends ArithmeticException {

	/**
	 * Constructeur de l'exception
	 */
	public DivisionParZeroException() {
		super("Division par zéro non autorisé ");
	}
	
}
