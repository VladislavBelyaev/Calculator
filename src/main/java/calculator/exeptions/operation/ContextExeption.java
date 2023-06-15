package main.java.calculator.exeptions.operation;

import main.java.calculator.exeptions.OperationExeption;

public class ContextExeption extends OperationExeption {

    public ContextExeption(){
        super();
    }

    public ContextExeption(String message){
        super(" context error:" + message);
    }

    public ContextExeption(String message, Throwable cause){
        super(" context error:" + message, cause);
    }
}
