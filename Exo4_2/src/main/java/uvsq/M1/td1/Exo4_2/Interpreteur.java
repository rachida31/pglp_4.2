package uvsq.M1.td1.Exo4_2;

import java.util.Stack;
import uvsq.M1.td1.Exo4_2.exception.ExceptionPileVide;

/**
 * L'interpreteur supporte uniquement les commandes
 * undo et quit. Utilisation du Pattern Command.
 * @author rachida ouchene.
 */
public class Interpreteur {
	/**
	 * La pile qui va stocker la valeur des opérades .
	 * @see Interpreteur#Interpreteur()
	 * @see Interpreteur#getPile()
	 */
	private Stack<Double> pile;
	/**
	 * pile des piles des operandes.
	 * @see Interpreteur#Interpreteur()
	 * @see Interpreteur#undo()
	 */
	private Stack<Stack<Double>> hisOperande;

	/**
	 * Constructeur Interpreteur.
	 * <p>
	 * A la construction d'un objet Interpreteur,
	 * en cree la pile "pile".
	 * </p>
	 * @see Interpreteur#pile
	 */
	public Interpreteur() {

		pile = new Stack<Double>();
		hisOperande = new Stack<Stack<Double>>();

	}

	/**
	 * constructeur Interpreteur.
	 * @param pile la pile des operandes.
	 * @param hisOperande  la pile des pile des
	 * operande.
	 * @see Interpreteur#pile
	 * @see Interpreteur#hisOperande
	 */
	public Interpreteur(final Stack<Double> pile, final
			Stack<Stack<Double>> hisOperande) {
		this.pile = pile;
		this.hisOperande = hisOperande;
	}

	/**
	 * Retourne La pile dse opérades.
	 * @return La pile dse opérades.
	 * @see pile
	 */

	public final Stack<Double> getPile() {
		return this.pile;
	}

	/**
	 * Retourne La pile des piles des opérades.
	 * @return La pile des piles des opérades.
	 * @see hisOperande
	 */

	public final Stack<Stack<Double>> getHisOperande() {
		return this.hisOperande;
	}
	/**
	 *laméthode setPile.
	 *@param valeur .
	 **/
	protected final void setPile(final Double valeur) {
		this.pile.push(valeur);
	}
	/**
	 *laméthode setPile1.
	 *@param valeur .
	 **/
	protected final void setPile1(final Stack<Double> valeur) {
		this.pile = valeur;
	}
	/**
	 *laméthode setHisOperande.
	 *@param valeur .
	 **/
	protected final void setHisOperande(final
			Stack<Double> valeur) {
		this.hisOperande.push(valeur);
	}
	/**
	 *laméthode setHisOperande2.
	 *@param valeur .
	 **/
	protected final void setHisOperande2(final
			Stack<Stack<Double>> valeur) {
		this.hisOperande = valeur;
	}

	/**
	 * Elle permit de quiter le programme.
	 */
	public final void exit() {
			System.exit(0);
	}
	/**
	 * Supprimme un element de la pile.
	 * @see pile.
	 */

	public final void undo() {

		if (!(this.pile.isEmpty()) && !(this.hisOperande.isEmpty())) {

			this.hisOperande.pop();
			this.pile.pop();
		} else if (!(this.hisOperande.isEmpty())) {

			this.hisOperande.pop();

		} else if (!(this.pile.isEmpty())) {

			this.pile.pop();

		} else {
			throw new ExceptionPileVide();
		}
	}

}