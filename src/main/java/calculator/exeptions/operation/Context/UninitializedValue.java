package main.java.calculator.exeptions.operation.Context;

import main.java.calculator.exeptions.operation.ContextExeption;

public class UninitializedValue extends ContextExeption {

    public UninitializedValue(){
        super(" parameter uninitialized");
    }
}
