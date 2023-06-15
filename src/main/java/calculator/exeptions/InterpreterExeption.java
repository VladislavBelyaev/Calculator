package main.java.calculator.exeptions;

public class InterpreterExeption extends CalculatorExeption{

    public InterpreterExeption(){
        super();
    }

    public InterpreterExeption(String message){
        super(message);
    }

    public InterpreterExeption(String message, Throwable cause){
        super(message, cause);
    }
}
