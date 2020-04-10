package uvsq.M1.td1.Exo4_2;
import static org.junit.Assert.*;
import org.junit.*;
import uvsq.M1.td1.Exo4_2.exception.*;

public class TestTypeOperation {
	
	@Before()
	public void setUp() {
	}
	
	
	
	@Test
	public void TestPlus()
	{
		assertTrue(TypeOperation.PLUS.eval(5, 3)==8.0);
	}
	@Test
	public void TestMOINS()
	{
		assertTrue(TypeOperation.MOINS.eval(2.5, 4)==-1.5);
	}
	@Test
	public void TestMULT()
	{
		assertTrue(TypeOperation.MULT.eval(5.5, 3)==16.5);
	}
	@Test
	public void TestDIV()
	{
		assertTrue(TypeOperation.DIV.eval(15, 2)==7.5);
	}
	@Test(expected=DivisionParZeroException.class)
	public void TestDIVParZero() 
	{
		TypeOperation.DIV.eval(15, 0);
	}
}
