package test.java.ru.unn.agile.LongMumber;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.ru.unn.agile.LongNumber.LongNumber;

public class WhenWorkWithLongNumber {

	private LongNumber lnNum1;
	private LongNumber lnNum2;
	private LongNumber result;
	
	@Test
	public void Add_1_To_0() {
		InitializePairLongNumber(1, 0);
		result = lnNum1.Add(lnNum2);
		
		assertEquals(1, result.value);
	}
	
	@Test
	public void Add_122_To_78() {
		InitializePairLongNumber(122, 78);
		result = lnNum1.Add(lnNum2);
		
		assertEquals(200, result.value);
	}
	
	//TODO Add @Test
	
	@Test
	public void Multiply_0_And_5() {
		InitializePairLongNumber(0, 5);
		result = lnNum1.Multiply(lnNum2);
		
		assertEquals(0, result.value);
	}
	
	@Test
	public void Multiply_23_And_135() {
		InitializePairLongNumber(23, 135);
		result = lnNum1.Multiply(lnNum2);
		
		assertEquals(3105, result.value);
	}
	
	//TODO Multiply @Test
	
	private void InitializePairLongNumber(int number1, int number2) {
		lnNum1 = new LongNumber(number1);
		lnNum2 = new LongNumber(number2);
	}

}
