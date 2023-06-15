package main.java.calculator.exeptions;

public class CalculatorExeption extends Exception{
    public CalculatorExeption() {
        super();
    }
    public CalculatorExeption(String message){
        super("Calculator exception:" + message);
    }
    public CalculatorExeption(String message, Throwable cause) {
        super("Calculator exception:" + message, cause);
    }
}
