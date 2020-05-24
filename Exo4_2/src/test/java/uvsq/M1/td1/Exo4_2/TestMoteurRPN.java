package uvsq.M1.td1.Exo4_2;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import uvsq.M1.td1.Exo4_2.Commande.Commande;
import uvsq.M1.td1.Exo4_2.Commande.EnregistrerOpCommande;
import uvsq.M1.td1.Exo4_2.Commande.OperationOpCommande;
import uvsq.M1.td1.Exo4_2.Commande.RetournerOpCommande;
import uvsq.M1.td1.Exo4_2.exception.*;

public class TestMoteurRPN {

	private MoteurRPN moteurRPN;
	private List<Commande> commande;

	@Before()
	public void setUp() {
		commande = new ArrayList<Commande>();
		moteurRPN = new MoteurRPN();
		commande.add(0, new EnregistrerOpCommande(moteurRPN, 10.5));
		commande.add(1, new EnregistrerOpCommande(moteurRPN, 3.5));
		commande.add(2, new EnregistrerOpCommande(moteurRPN, 2.5));
		commande.add(3, new EnregistrerOpCommande(moteurRPN, 10.5));
		commande.add(4, new EnregistrerOpCommande(moteurRPN, 2.0));
		commande.add(5, new EnregistrerOpCommande(moteurRPN, 4.0));
		commande.add(6, new OperationOpCommande(moteurRPN, TypeOperation.MOINS));
		commande.add(7, new OperationOpCommande(moteurRPN, TypeOperation.PLUS));
		commande.add(8, new OperationOpCommande(moteurRPN, TypeOperation.DIV));
		commande.add(9, new OperationOpCommande(moteurRPN, TypeOperation.MULT));
		commande.add(10, new RetournerOpCommande(moteurRPN));
		commande.add(11, new EnregistrerOpCommande(moteurRPN, -100000.0));
		commande.add(12, new EnregistrerOpCommande(moteurRPN, 4000000000000000.0));
		commande.add(13, new EnregistrerOpCommande(moteurRPN, 0.0));

	}

	@Test
	public void testenregistrerOp() {
		commande.get(0).execute();
		commande.get(1).execute();
		commande.get(2).execute();
		commande.get(3).execute();
		commande.get(4).execute();
		commande.get(5).execute();
		assertTrue(moteurRPN.getPile().get(0) == 10.5);
		assertTrue(moteurRPN.getPile().get(5) == 4.0);
		assertTrue(moteurRPN.getPile().size() == 6);

	}

	@Test(expected = ExceptionMin.class)
	public void testenregistrerOpExceptionMin() {

		commande.get(11).execute();

	}

	@Test(expected = ExceptionMax.class)
	public void testenregistrerOpExceptionMax() {

		commande.get(12).execute();

	}

	@Test
	public void testOperationOpCommande() {
		commande.get(0).execute();
		commande.get(1).execute();
		commande.get(2).execute();
		commande.get(3).execute();
		commande.get(4).execute();
		commande.get(5).execute();
		commande.get(6).execute();
		commande.get(7).execute();
		commande.get(8).execute();
		commande.get(9).execute();
		assertTrue(moteurRPN.getPile().get(0) == 10.5);
		assertTrue(moteurRPN.getPile().get(1) == 17.5);

	}

	@Test(expected = NbOperationsException.class)
	public void testOperationOpCommandeExceptionOp() {
		commande.get(0).execute();
		commande.get(6).execute();

	}

	/*@Test(expected = DivisionParZeroException.class)
	public void testOperationOpCommandeExceptionZero() throws DivisionParZeroException {

		commande.get(13).execute();
		commande.get(0).execute();
		commande.get(8).execute();

	}
*/
	@Test
	public void testRetournerOpCommande() {
		commande.get(0).execute();
		commande.get(1).execute();
		commande.get(2).execute();
		commande.get(3).execute();
		commande.get(4).execute();
		commande.get(5).execute();
		commande.get(10).execute();

	}
}
