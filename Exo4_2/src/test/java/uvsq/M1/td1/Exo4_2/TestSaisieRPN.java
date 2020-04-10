package uvsq.M1.td1.Exo4_2;
import org.junit.*;
	
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
