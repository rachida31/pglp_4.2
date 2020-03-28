package uvsq.M1.td1.Exo4_2;

import java.util.Stack;




/**
 * L'interpreteur  supporte uniquement les commandes
 * undo et quit.
 * Utilisation du  Pattern Command.
 * @author rachida ouchene.
 * @date 28/03/2020.
 */
public class Interpreteur {
	 /**
     * La pile qui va stocker la valeur des opérades .
     * 
     * @see Interpreteur#Interpreteur(String,String,int,int,int,int,int)
     * @see Interpreteur#getPile()
     */
    private Stack<Double> pile;

    
    /**
     * Constructeur Interpreteur.
     * <p>
     * A la construction d'un objet Interpreteur, en cree la pile "pile".
     * </p>
     * @see Interpreteur#pile
     */
	public Interpreteur()
	{

		pile=new Stack<Double>();
	}

	/**
     * Retourne La pile dse opérades.
     * 
     * @return La pile dse opérades.
     * 
     * @see pile
     */
	
	public Stack<Double> getPile()
	{
		return this.pile;
	}
	
	public void setPile(Double valeur)
	{
		this.pile.push(valeur);
	}

	/**
     * Elle permit de quiter le programme.
     */
public void exit()
{
	System.exit(0);
}

/**
 * Supprimme un element de la pile.
 * @see pile.
 */

public void undo()
{
	if(!(this.pile.isEmpty()))
	{
		this.pile.pop();
	}
}

}
