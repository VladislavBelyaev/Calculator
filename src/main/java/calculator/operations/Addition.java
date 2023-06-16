package main.java.calculator.operations;

import main.java.calculator.context.Context;
import main.java.calculator.exeptions.OperationExeption;

public class Addition implements Operation{
    @Override
    public void Do(Context ctx, String[] args) throws OperationExeption {
        Double second = ctx.GetArgument();
        Double first = ctx.GetArgument();
        ctx.PutArgument(first + second);
    }
}
