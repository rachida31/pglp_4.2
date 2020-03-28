package uvsq.M1.td1.Exo4_2;
import uvsq.M1.td1.Exo4_2.Commande.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import org.junit.*;
public class TestInterpreteur {

	private List<Commande> commande;
	private Interpreteur inter;

	@Before()
	public void setUp() {
		inter=new Interpreteur();
		commande=new ArrayList<Commande>();
	}
	
	
	
	@Test
	public void testUndo()
	{
		inter.setPile(5.5);
		commande.add(new UndoCommande(inter));
		commande.get(0).execute();
		System.out.println(inter.getPile());
		System.out.println(inter.getPile().isEmpty());
		assertTrue(inter.getPile().isEmpty()== true);
	
	}
	@Test
	public void testExit()
	{
		commande.add(new ExitCommande(inter));
		commande.get(0).execute();
	
	}
}
