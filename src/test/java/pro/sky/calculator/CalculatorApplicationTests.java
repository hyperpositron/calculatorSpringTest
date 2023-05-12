package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.sky.calculator.exeption.MyIllegalArgumentException;
import pro.sky.calculator.services.CalculatorService;

@SpringBootTest
class CalculatorApplicationTests {
	CalculatorService service = new CalculatorService();

	@Test
	void sumPositiveNumbersTest() {
		int result=service.add(5,5);
		Assertions.assertEquals(10,result);
	}
	@Test
	void sumNegativeNumbersTest() {
		int result=service.add(-5,-5);
		Assertions.assertEquals(-10,result);
	}
	@Test
	void minusPositiveNumbersTest() {
		int result=service.minus(5,5);
		Assertions.assertEquals(0,result);
	}
	@Test
	void minusNegativeNumbersTest() {
		int result=service.minus(-5,-5);
		Assertions.assertEquals(0,result);
	}
	@Test
	void multiplyPositiveNumbersTest() {
		int result=service.multiply(5,5);
		Assertions.assertEquals(25,result);
	}
	@Test
	void multiplyNegativeNumbersTest() {
		int result=service.multiply(-5,5);
		Assertions.assertEquals(-25,result);
	}
	@Test
	void dividePositiveNumbersTest() {
		int result=service.divide(5,5);
		Assertions.assertEquals(1,result);
	}
	@Test
	void divideNegativeNumbersTest() {
		int result=service.divide(-5,5);
		Assertions.assertEquals(-1,result);
	}

	@Test
	void checkDivideByZeroTest(){
		Assertions.assertThrows(MyIllegalArgumentException.class,()->service.divide(5,0));
	}

}
