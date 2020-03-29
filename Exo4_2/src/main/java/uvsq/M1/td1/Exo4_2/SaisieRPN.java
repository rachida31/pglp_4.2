package uvsq.M1.td1.Exo4_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import uvsq.M1.td1.Exo4_2.exception.*;
import uvsq.M1.td1.Exo4_2.Commande.Commande;

/**
 * Gère la saisie RPN.
 * Les operandes sont empilés dans la pile , les opérations sont appliquées au sommet de la pile.  
 * 
 * @author rachida ouchene.
 * 
 */
public class SaisieRPN {
	private MoteurRPN moteurRPN;
	private Scanner scanner;
	private Boolean bool=true; 

	
	/**
	 * Constructeur de la classe  
	 */	
	public SaisieRPN()
	{
		moteurRPN = new MoteurRPN();
	}

	
	
	/**
	 * Fonction pour la saisie et l'affichage
	 * Appelée par CalculatriceRPN
	 */
	public void saisie() {
		this.scanner=new Scanner(System.in);
		String input = ""; 
		String str = "";
		
		System.out.println("############################################################# \n");
		System.out.println("       ************* La calculatriceRPN ************** \n");
		System.out.println("##############################################################\n \n");
		System.out.println("*********************** Choix de la saisie au clavier  ******************* \n");
		System.out.println("      1)-soit un nombre \n");
		System.out.println("      2)-soit une opération \n");
		System.out.println("      3)-soit undo pour annuler la saisie précédente \n");
		System.out.println("      4)-soit exit pour sortir \n \n ");
		System.out.println("Chaque saisie se terminera par entrée \n");
		while(bool)
		{
			System.out.println(" \n ************* Vous pouvez saisir ****************");	

			try {
				input = scanneLigne();
				str += input + " ";
				System.out.println(str);
			}
			catch (Exception e) {
				System.err.println(e.getMessage());
			}
			moteurRPN.retournerOp();
		}


		System.out.println(" ************************  \n Fin du programme  *****************************");
		this.scanner.close();    
		}
	
	
	

	/**
	 * scanne une ligne
	 * @return operande, double ou exit 
	 * @throws DivisionParZeroException
	 * @throws ExceptionMax
	 * @throws ExceptionMin
	 * @throws ExceptionPileVide
	 * @throws ErreurSaisieException
	 * @throws IllegalArgumentException 
	 * 				Pour une erreur dans la saisie. 
	 */
	public String scanneLigne() throws DivisionParZeroException, ExceptionMax, ExceptionMin,
	ExceptionPileVide {
		String input;
		if (scanner.hasNextDouble()) {
			Double op = scanner.nextDouble();
			moteurRPN.enregistrerOp(op);
			scanner.nextLine();
			input = op.toString();
		} 
		else {
			input = scanner.nextLine();
			if (input.equals("exit")) {
				bool=false;
				System.out.println(" \n ************************   Fin du programme  *****************************");
				this.scanner.close();  
				moteurRPN.exit();
			}
			else if (input.equals("undo")) {
				moteurRPN.undo();
			}
			
			else if (this.operation(input)!=null) {
				moteurRPN.operationOp(operation(input));	
			}
			else {
				throw new IllegalArgumentException(" \n Erreur de saisie.");
			}
		}
		return input;
	}
	

	/**
	 * Retourne type de l'opération correspondant au String saisie
	 * @param str saisie.
	 * @return Opération
	 * @see SaisieRPN#
	 */
	private TypeOperation operation(String str) {
		for (TypeOperation op : TypeOperation.values())
			if (str.equals(op.getTypeOper()))
				return op;
		return null;
	}
		
	}

