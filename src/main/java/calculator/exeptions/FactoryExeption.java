package main.java.calculator.exeptions;

public class FactoryExeption extends CalculatorExeption{

    public FactoryExeption(){
        super();
    }

    public FactoryExeption(String message){
        super(" factory exeption: " + message);
    }

    public FactoryExeption(String message, Throwable cause){
        super(" factory exeption: " + message, cause);
    }
}
