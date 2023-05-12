package pro.sky.calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentAccessException;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.services.CalculatorService;

import java.util.stream.Stream;

public class CalculatorParametrizedTest {
    CalculatorService service = new CalculatorService();
    @ParameterizedTest
    @MethodSource("paramsForSumTest")
    public void sumTest(int a ,int b , int result){
        Assertions.assertEquals(result,service.add(a,b));
    }
    public static Stream<Arguments> paramsForSumTest(){
        return Stream.of(Arguments.of(5,5,10),Arguments.of(10,10,20),Arguments.of(100,100,200),Arguments.of(-5,-5,-10));
    }
    @ParameterizedTest
    @MethodSource("paramsForMinusTest")
    public void minusTest(int a ,int b , int result){
        Assertions.assertEquals(result,service.minus(a,b));
    }
    public static Stream<Arguments> paramsForMinusTest(){
        return Stream.of(Arguments.of(10,5,5),Arguments.of(100,50,50),Arguments.of(100,100,0),Arguments.of(-5,-5,0));
    }
    @ParameterizedTest
    @MethodSource("paramsForMultiplyTest")
    public void multiplyTest(int a ,int b , int result){
        Assertions.assertEquals(result,service.multiply(a,b));
    }
    public static Stream<Arguments> paramsForMultiplyTest(){
        return Stream.of(Arguments.of(5,5,25),Arguments.of(100,10,1000),Arguments.of(100,100,10000),Arguments.of(2,2,4));
    }

}
