package uvsq.M1.td1.Exo4_2.exception;
/**
 * Exception lancer dans le cas ou il manque un operande .
 * @author rachida ouchene
 */
public class NbOperationsException extends IllegalArgumentException {
	
	
	/**
	 * Constructeur de l'exception
	 */
	public NbOperationsException() {
		super(" \n Il n'y a pas assez d'operande,pour effecuer cette operations.");
	}
	

}
