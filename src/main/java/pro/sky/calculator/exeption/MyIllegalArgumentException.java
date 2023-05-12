package pro.sky.calculator.exeption;

public class MyIllegalArgumentException extends IllegalArgumentException {
    public MyIllegalArgumentException(){
        super();
    }
    public MyIllegalArgumentException(String msg){
        super(msg);
    }
}
