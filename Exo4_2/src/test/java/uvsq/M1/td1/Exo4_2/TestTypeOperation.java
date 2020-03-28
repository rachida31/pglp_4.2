package uvsq.M1.td1.Exo4_2;
import static org.junit.Assert.*;
import org.junit.*;

public class TestTypeOperation {
	private TypeOperation typeOP;
	
	@Before()
	public void setUp() {
	}
	
	
	
	@Test
	public void TestPlus()
	{
		assertTrue(typeOP.PLUS.eval(5, 3)==8.0);
	}
	
	public void TestMOINS()
	{
		assertTrue(typeOP.MOINS.eval(2.5, 4)==-1.5);
	}
	public void TestMULT()
	{
		assertTrue(typeOP.MULT.eval(5, 3)==16.5);
	}
	public void TestDIV()
	{
		assertTrue(typeOP.DIV.eval(15, 2)==7.5);
	}
}
