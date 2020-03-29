package uvsq.M1.td1.Exo4_2;
import java.util.Stack;

import uvsq.M1.td1.Exo4_2.exception.ExceptionMax;
import uvsq.M1.td1.Exo4_2.exception.ExceptionMin;
import uvsq.M1.td1.Exo4_2.exception.DivisionParZeroException;
import uvsq.M1.td1.Exo4_2.exception.NbOperationsException;
/**
 * Gestion de la pile d'opérandes
 * @author rachida ouchene
 * 
 */

public class MoteurRPN extends Interpreteur{
	
	private static final double MAX_VALUE = 100000;
	private static final double MIN_VALUE = 0;

	
	/**
	 * Constructeur MoteurRPN.
	 *
	 *Il fait appelle au Constructeur de la super classe en utilisant le mot clé super
	 *	 
	 *
	 * */
	public MoteurRPN()
	{
		super();
	}
	/**
	 * Constructeur MoteurRPN.
	 *
	 *Il fait appelle au Constructeur de la super classe en utilisant le mot clé super
	 *	 
	 *
	 * */
	public MoteurRPN(Stack<Double> pile, Stack<Stack<Double>> hisOperande)
	{
		super(pile,hisOperande);
	}


	/**
	 * méthode enregisterOp.
	 * Enregistere un operande dans la pile des opérandes mais aussi metre à jour l'historique des opérandes.
	 * Elle lance une exception si la valeur absolue de l'opérande est trop grande de MAX_VALUE
	 *  ou trop petite de MIN_VALUE.
	 * @param op1
	 *@see MoteurRPN#MAX_VALUE
	 *@see MoteurRPN#MIN_VALUE
	     */
    public void enregistrerOp(double op1){

        if ( Math.abs(op1) <=MAX_VALUE && Math.abs(op1) >= MIN_VALUE) {

           this.setPile(op1);
           Stack <Double> pileTmp=new Stack();//pour metre à jour l'historique des operandes
           pileTmp.addAll(this.getPile());
           this.setHisOperande(pileTmp);
           
        }
        else if(Math.abs(op1) >MAX_VALUE)
        {
        	throw new ExceptionMax();
        	}
        else  throw new ExceptionMin();

    }

    public void operationOp(TypeOperation operation){
        try {
            if (this.getPile().size()>= 2) {
        		this.enregistrerOp(operation.eval(this.getPile().pop(),this.getPile().pop()));
            }
            else
            {
            	throw new NbOperationsException();
            }
        } catch (DivisionParZeroException e) {
            e.printStackTrace();
        }
    }
    
  
    /**
	 * méthode d'affichage des opérandes de la pile
	 *
	 */	
    public void retournerOp(){
    	String s = "[";
    		for (Double d : this.getPile()) {
    			s += (d + " ");
    		}	
    		System.out.println( s.trim() + "]");
    	    }
	
	
	
	

		}
	
	
	

