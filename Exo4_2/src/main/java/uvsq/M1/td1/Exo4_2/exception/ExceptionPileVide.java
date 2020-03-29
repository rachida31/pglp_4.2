package uvsq.M1.td1.Exo4_2.exception;
/**
 * Exception si la pile est vide .
 * @date 28/03/2020.
 * @author ouchene rachida.
 * 
 */
public class ExceptionPileVide extends IllegalArgumentException {

	/**
	 * Constructeur de l'exception
	 */
	public ExceptionPileVide() {
		super(" \n la pile est vide nous pouvons pas effectuer cette opération");
	}

}
