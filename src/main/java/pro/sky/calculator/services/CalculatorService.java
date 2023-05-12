package pro.sky.calculator.services;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exeption.MyIllegalArgumentException;

@Service
public class CalculatorService {
    public int add(int x, int y) {
        return x+y;
    }
    public int minus(int x, int y) {
        return x-y;
    }
    public int multiply(int x, int y) {
        return x*y;
    }
    public int divide(int x, int y) {
        if(y==0){
            throw new MyIllegalArgumentException("Divide by 0");
        }
        return x/y;
    }
}
