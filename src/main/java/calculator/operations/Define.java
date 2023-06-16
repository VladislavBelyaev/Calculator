package main.java.calculator.operations;

import main.java.calculator.context.Context;
import main.java.calculator.exeptions.OperationExeption;
import main.java.calculator.exeptions.operation.Context.InvalidArgument;
import main.java.calculator.exeptions.operation.NotEnoughArguments;
import main.java.calculator.other.Helper;

public class Define implements Operation{
    @Override
    public void Do(Context ctx, String[] args) throws OperationExeption {
        if(args.length != 2)
            throw new NotEnoughArguments();
        if(!Helper.IsNumber(args[1]))
            throw new InvalidArgument();
        ctx.PutParameter(args[0], Double.parseDouble(args[1]));
    }
}
