package main.java.calculator.exeptions;

public class OperationExeption extends CalculatorExeption{

    public OperationExeption(){
        super();
    }

    public OperationExeption(String message){
        super(" operation exception:" + message);
    }

    public OperationExeption(String message, Throwable cause){
        super(" operation exception:" + message, cause);
    }
}
