package uvsq.M1.td1.Exo4_2;
import static org.junit.Assert.*;
import org.junit.*;
import uvsq.M1.td1.Exo4_2.exception.*;

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
	@Test
	public void TestMOINS()
	{
		assertTrue(typeOP.MOINS.eval(2.5, 4)==-1.5);
	}
	@Test
	public void TestMULT()
	{
		assertTrue(typeOP.MULT.eval(5.5, 3)==16.5);
	}
	@Test
	public void TestDIV()
	{
		assertTrue(typeOP.DIV.eval(15, 2)==7.5);
	}
	@Test(expected=DivisionParZeroException.class)
	public void TestDIVParZero() 
	{
		typeOP.DIV.eval(15, 0);
	}
}
