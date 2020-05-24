package uvsq.M1.td1.Exo4_2.exception;

/**
* @author rachida ouchene Exception renvoyée si
* la valeur est trop grande.
*/
public class ExceptionMax extends ArithmeticException {
/**.
* contrôleur de la version.
*/
private static final long serialVersionUID = 1L;
/**.
* Constructeur de l'exception.
*/
public ExceptionMax() {
super(" \n Valeur absolue trop grande ");
}
}
