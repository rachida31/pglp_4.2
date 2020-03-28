package uvsq.M1.td1.Exo4_2;
import uvsq.M1.td1.Exo4_2.exception.*;

/**
 * enum pour les quatres operations  de la calculatrice. 
 * @author rachida ouchene
 * @date 28/03/2020.
 */
public enum TypeOperation {

	PLUS("+"){

		@Override
		public double eval(double x, double y) {
			return x + y;
		}

	}, 

	MOINS("-"){

		@Override
		public double eval(double x, double y) {
			return x - y;
		}

	},

	MULT("*"){

		@Override
		public double eval(double x, double y) {
			return x * y;
		}

	},

	DIV("/"){

		@Override
		public double eval(double x, double y) {
			if(y==0)
			{
			 throw	new DivisionParZeroException();
			}
			return x / y;
		}

	};

	/**
	 * La méthode abstraite qui  permets l'évaluation de l'operation et qu'est redéfinie pour chaque type d'opération.
	 * @param x.
	 * @param y.
	 * @return un double est le resulta de l'exection de l'opération.
	 */
	public abstract double eval(double x , double y);

	private String typeOper;

	/**
	 * Initialisation de typeOper
	 * @param typeOper
	 *  @see TypeOperation#typeOper
	 */
	private TypeOperation(String typeOper) {
		this.typeOper = typeOper; 
	}
	/**
	 * récupération du type de typeOper
	 * @return  le type de  "typeOper"
	 *  @see typeOper
	 */
	public String getTypeOper() {
		return typeOper;
	}




}