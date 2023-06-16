package main.java.calculator.operations;

import main.java.calculator.context.Context;
import main.java.calculator.exeptions.OperationExeption;

public class Print implements Operation{
    @Override
    public void Do(Context ctx, String[] args) throws OperationExeption {
        System.out.println(ctx.PeekArgument());
    }
}
