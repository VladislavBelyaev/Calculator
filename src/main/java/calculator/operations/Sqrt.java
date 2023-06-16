package main.java.calculator.operations;

import main.java.calculator.context.Context;
import main.java.calculator.exeptions.OperationExeption;
import main.java.calculator.exeptions.operation.SQRTFromNegative;

import static java.lang.Math.sqrt;

public class Sqrt implements Operation{

    @Override
    public void Do(Context ctx, String[] args) throws OperationExeption {
        Double value = ctx.GetArgument();
        if(value < 0)
            throw new SQRTFromNegative();
        ctx.PutArgument(sqrt(value));
    }
}
