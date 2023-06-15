package main.java.calculator.operations;

import main.java.calculator.context.Context;
import main.java.calculator.exeptions.OperationExeption;

public interface Operation {
    public abstract void Do(Context ctx, String[] args) throws OperationExeption;

}
