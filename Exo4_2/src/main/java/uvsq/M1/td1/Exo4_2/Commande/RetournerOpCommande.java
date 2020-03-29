package uvsq.M1.td1.Exo4_2.Commande;
import uvsq.M1.td1.Exo4_2.MoteurRPN;
/**
*classe RetournerOpCommande.
* @author rachida ouchene.
*/
public class RetournerOpCommande implements Commande {

		
		/**  moteurRPN de type MoteurRPN.
		    * @see RetournerOpCommande#AjouterUnOperande( MoteurRPN , Double )
		    * @see RetournerOpCommande#execute()
		    */
		private MoteurRPN moteurRPN;
		
		/**
		 * constructeur OperationOpCommande.
		 * qui couper la reference de moteurRPN dans this.moteurRPN.
		 * @param moteurRPN c'est un objet de type MoteurRPN.
		 * @see RetournerOpCommande#moteurRPN .
		 * */
	public RetournerOpCommande(MoteurRPN moteurRPN)
	{
		this.moteurRPN=moteurRPN;
	}
	/**
	 * Méthode execute qui fait appelle a la méthode retournerOp de MoteurRPN pour 
	 * afficher la pile des opérandes.
	 * 
	 * */
	public void execute() {
		// TODO Auto-generated method stub
		this.moteurRPN.retournerOp();
	}

}
