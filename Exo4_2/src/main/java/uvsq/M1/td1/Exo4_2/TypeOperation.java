package uvsq.M1.td1.Exo4_2;

import uvsq.M1.td1.Exo4_2.exception.*;

/**
 * enum pour les quatres operations de la calculatrice.
 * @author rachida ouchene
 */
public enum TypeOperation {
	/**
	 *le plus.
	 **/
	PLUS("+") {
		/**
		 * la méthode eval pour faire le plus.
		 **/
		@Override
		public final double eval(final double x, final double y) {
			return x + y;
		}

	},
	/**
	 *le moins.
	 **/
	MOINS("-") {
		/**
		 * la méthode eval pour faire le moins.
		 **/
		@Override
		public final double eval(final double x, final double y) {
			return x - y;
		}

	},
	/**
	 *la multiplication.
	 **/
	MULT("*") {
		/**
		 * la méthode eval pour faire la multiplication.
		 **/
		@Override
		public double eval(final double x, final double y) {
			return x * y;
		}

	},
	/**
	 *La division.
	 **/
	DIV("/") {
		/**
		 * la méthode eval pour faire la division.
		 **/
		@Override
		public final double eval(final double x, final double y) {
			if (y == 0) {
				throw new DivisionParZeroException();
			}
			else {
			return x / y;
			}
		}

	};

	/**
	 * La méthode abstraite qui permets l'évaluation
	 * de l'operation et qu'est
	 * redéfinie pour chaque type d'opération.
	 * @param x la valeur de x
	 * @param y la valeur de y
	 * @return un double est le resulta de l'exection
	 * de l'opération.
	 */
	public abstract double eval(final double x, final double y);
	/**
	 * type de l'operation.
	 * */
	private String typeOper;

	/**.
	 * Initialisation de typeOper.
	 * @param typeOper type de l'opération.
	 * @see TypeOperation#typeOper
	 */
	private TypeOperation(final String typeOper) {
		this.typeOper = typeOper;
	}

	/**
	 * récupération du type de typeOper.
	 * @return le type de "typeOper"
	 * @see typeOper
	 */
	public final String getTypeOper() {
		return typeOper;
	}

}
