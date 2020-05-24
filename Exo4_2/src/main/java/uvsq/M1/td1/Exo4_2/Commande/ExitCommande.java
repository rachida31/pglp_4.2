package uvsq.M1.td1.Exo4_2.Commande;

import uvsq.M1.td1.Exo4_2.Interpreteur;

/**
 * C'est une commandes concrètes, pour quiter le
 * programme .
 * @author ouchene rachida
 */
public class ExitCommande implements Commande {

	/**
	 * Reference au Interpreteur.
	 * @see ExitCommande#ExitCommande(Interpreteur)
	 */
	private Interpreteur inter;

	/**
	 * Constructeur UndoCommande.
	 * <p>
	 * A la construction d'un objet UndoCommande, on
	 * coupier la reference de inter.
	 * dans this.inter .
	 * </p>
	 * @param inter est un objet de type Interpreteur .
	 * @see ExitCommande#inter
	 */
	public ExitCommande(final Interpreteur inter) {
		this.inter = inter;

	}
	/**
	 * la méthode execute.
	 * */
	public final  void execute() {
		this.inter.exit();
	}
}
