package uvsq.M1.td1.Exo4_2.Commande;

import uvsq.M1.td1.Exo4_2.Interpreteur;

/**
 * C'est une commandes concrètes, pour supprimer un
 * element .
 * @author ouchene rachida
 */
public class UndoCommande implements Commande {
	/**.
	 * Reference au Interpreteur.
	 * @see UndoCommande#UndoCommande(Interpreteur)
	 */
	private Interpreteur inter;

	/**
	 * Constructeur UndoCommande.
	 * <p>
	 * A la construction d'un objet UndoCommande, on
	 * coupier la reference de inter
	 * dans this.inter .
	 * </p>
	 * @param inter est un objet de type Interpreteur .
	 * @see UndoCommande#inter
	 */
	public UndoCommande(final Interpreteur inter) {
		this.inter = inter;
	}
	/**
	 *la méthode execute.
	 **/
	public final void execute() {
		this.inter.undo();

	}

}
