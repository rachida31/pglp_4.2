package uvsq.M1.td1.Exo4_2.exception;

/**
 * Exception a cause de la division par zéro.
 * @author ouchene rachida.
 */
public class DivisionParZeroException
extends ArithmeticException {
/**.
* contrôleur de la version.
*/
private static final long serialVersionUID = 1L;

/**
* Constructeur de l'exception.
*/
public DivisionParZeroException() {
super("Division par zéro non autorisé ");
}
}
