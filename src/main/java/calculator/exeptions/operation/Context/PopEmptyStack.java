package main.java.calculator.exeptions.operation.Context;

import main.java.calculator.exeptions.operation.ContextExeption;

public class PopEmptyStack extends ContextExeption {

    public PopEmptyStack()
    {
        super(" stack is empty\n");
    }
}
