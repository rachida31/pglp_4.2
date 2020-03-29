package uvsq.M1.td1.Exo4_2;
import static org.junit.Assert.*;
import org.junit.*;
import uvsq.M1.td1.Exo4_2.exception.*;;
	
public class TestSaisieRPN {
	
	private SaisieRPN saisieRPN;
	
	
	
	
		@Before()
		public void setUp() {
			saisieRPN = new SaisieRPN();
		}
	
		@Test
		public void testSaisieRPN()
		{
			saisieRPN.saisie();
		}

}
