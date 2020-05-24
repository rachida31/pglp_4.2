package uvsq.M1.td1.Exo4_2.Commande;

import uvsq.M1.td1.Exo4_2.MoteurRPN;
import uvsq.M1.td1.Exo4_2.TypeOperation;

/**
 * classe OperationOpCommande.
 * @author rachida ouchene.
 */
public class OperationOpCommande implements Commande {

	/**
	 * moteurRPN de type MoteurRPN.
	 * @see OperationOpCommande#AjouterUnOperande
	 * ( MoteurRPN , Double ).
	 * @see OperationOpCommande#execute()
	 */
	private MoteurRPN moteurRPN;
	/**
	 * operation de type TypeOperation pour faire
	 * executer cette operation sur les operandes .
	 * @see OperationOpCommande#OperationOpCommande
	 * ( MoteurRPN , Operation)
	 * @see OperationOpCommande#execute()
	 */
	private TypeOperation operation;

	/**
	 * constructeur OperationOpCommande. qui initialise
	 * this.operation a operation ,
	 * et couper la reference de moteurRPN dans
	 * this.moteurRPN.
	 * @param moteurRPN c'est un objet de type
	 * MoteurRPN.
	 * @param operation L'operande de type
	 * TypeOperation c'est le type de
	 * l'operation aeffectuer sur les opérandes.
	 * @see OperationOpCommande#moteurRPN .
	 * @see OperationOpCommande#operation .
	 */
	public OperationOpCommande(final MoteurRPN moteurRPN, final
			TypeOperation operation) {
		this.moteurRPN = moteurRPN;
		this.operation = operation;
	}

	/**
	 * Méthode execute qui fait appelle a la méthode
	 * operationOp de MoteurRPN pour
	 * effectuer l'operation operation sur les
	 * opérandes de la pile.
	 */
	public final void execute() {
		// TODO Auto-generated method stub
		this.moteurRPN.operationOp(operation);
	}

}
