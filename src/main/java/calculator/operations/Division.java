package main.java.calculator.operations;

import main.java.calculator.context.Context;
import main.java.calculator.exeptions.OperationExeption;
import main.java.calculator.exeptions.operation.DivisionByZero;

public class Division implements Operation{

    @Override
    public void Do(Context ctx, String[] args) throws OperationExeption {
        Double second = ctx.GetArgument();
        if(second == 0){
            throw new DivisionByZero();
        }
        Double first = ctx.GetArgument();
        ctx.PutArgument(first/second);
    }
}
