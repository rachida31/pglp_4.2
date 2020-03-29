package uvsq.M1.td1.Exo4_2;
import uvsq.M1.td1.Exo4_2.Commande.*;
import uvsq.M1.td1.Exo4_2.exception.ExceptionPileVide;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import org.junit.*;
public class TestInterpreteur {

	private List<Commande> commande;
	private Interpreteur inter;
	private Stack <Double>pile;
	private Stack <Stack<Double>> hisOperande;

	@Before()
	public void setUp() {
		pile=new Stack<Double>();
		hisOperande=new Stack<Stack<Double>>();
		commande=new ArrayList<Commande>();
	}
	
	
	
	@Test
	public void testUndo()
	{
		Stack <Double>pileTmp;
		pileTmp=new Stack<Double>();
		pile.add(0.5);
		pile.add(9.01);
		pileTmp.addAll(pile);
		hisOperande.add(pileTmp);
		pileTmp=new Stack<Double>();
		pile.add(50.8);
		pileTmp.addAll(pile);
		hisOperande.add(pileTmp);
		inter=new Interpreteur(pile,hisOperande);
		commande.add(new UndoCommande(inter));
		commande.get(0).execute();
		assertTrue(inter.getHisOperande().isEmpty()== false);
		assertTrue(inter.getPile().isEmpty()== false);
		commande.get(0).execute();
		assertTrue(inter.getHisOperande().isEmpty()== true);
		assertTrue(inter.getPile().isEmpty()== false);
	
	}
	@Test(expected=ExceptionPileVide.class)
	public void testUndoPilevide()
	{
		inter=new Interpreteur();
		commande.add(new UndoCommande(inter));
		commande.get(0).execute();
		assertTrue(inter.getPile().isEmpty()== true);
	
	}
	
	@Test
	public void testExit()
	{
		commande.add(new ExitCommande(inter));
		commande.get(0).execute();
	
	}
}
