package uvsq.M1.td1.Exo4_2.Commande;

import uvsq.M1.td1.Exo4_2.MoteurRPN;

/**
 * classe EnregistrerOpCommande.
 * @author rachida ouchene.
 */
public class EnregistrerOpCommande implements Commande {
	/**
	 * moteurRPN de type MoteurRPN.
	 * @see AjouterUnOperande#AjouterUnOperande
	 * ( MoteurRPN , Double )
	 * @see AjouterUnOperande#execute()
	 */
	private MoteurRPN moteurRPN;
	/**
	 * operande de type Double pour le rajouter a la
	 * pile des opérandes.
	 * @see AjouterUnOperande#AjouterUnOperande
	 * ( MoteurRPN , Double).
	 * @see AjouterUnOperande#execute().
	 */
	private Double op;

	/**
	 * constructeur EnregistrerOpCommande. qui
	 * initialise this.op a op , et couper.
	 * la reference de moteurRPN dans this.moteurRPN.
	 * @param moteurRPN c'est un objet de type
	 * MoteurRPN.
	 * @param op L'operande de type Double pour
	 * l'ajouter dans la pile.
	 * @see EnregistrerOpCommande#moteurRPN .
	 * @see EnregistrerOpCommande#op .
	 */
	public EnregistrerOpCommande(final MoteurRPN moteurRPN, final
			Double op) {
		this.op = op;
		this.moteurRPN = moteurRPN;
	}

	/**
	 * Méthode execute qui fait appelle a la méthode
	 * enregistrerOp de MoteurRPN pour.
	 * enregistrer une opérande dans la pile.
	 */
	public final void execute() {
		// TODO Auto-generated method stub
		this.moteurRPN.enregistrerOp(op);

	}

}
