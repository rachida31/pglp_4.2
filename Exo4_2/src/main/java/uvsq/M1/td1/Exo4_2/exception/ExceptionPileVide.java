package uvsq.M1.td1.Exo4_2.exception;

/**
* Exception si la pile est vide .
* @author ouchene rachida.
*/
public class ExceptionPileVide extends IllegalArgumentException {
/**.
* contrôleur de la version.
*/
private static final long serialVersionUID = 1L;
/**.
* Constructeur de l'exception.
*/
public ExceptionPileVide() {
super(" \n la pile est vide nous pouvons pas "
+ "effectuer cette opération");
}
}
