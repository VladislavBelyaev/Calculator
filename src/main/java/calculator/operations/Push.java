package main.java.calculator.operations;

import main.java.calculator.context.Context;
import main.java.calculator.exeptions.OperationExeption;
import main.java.calculator.exeptions.operation.NotEnoughArguments;

public class Push implements Operation{

    @Override
    public void Do(Context ctx, String[] args) throws OperationExeption {
        if(args.length != 1){
            throw new NotEnoughArguments();
        }
        ctx.PutArgument(args[0]);
    }
}
