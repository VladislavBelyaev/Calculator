package main.java.calculator.exeptions.operation;

import main.java.calculator.exeptions.OperationExeption;

public class NotEnoughArguments extends OperationExeption {

    public NotEnoughArguments(){
        super(" not enough arguments\n");
    }

}
