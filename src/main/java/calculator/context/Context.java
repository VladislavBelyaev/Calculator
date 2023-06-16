package main.java.calculator.context;

import main.java.calculator.exeptions.operation.Context.PopEmptyStack;
import main.java.calculator.exeptions.operation.Context.UninitializedValue;
import main.java.calculator.exeptions.operation.ContextExeption;
import main.java.calculator.other.Helper;

import java.util.HashMap;
import java.util.Stack;

public class Context {
    private final Stack<String> stack;
    private final HashMap<String,Double> table;

    public Context(){
        stack = new Stack<>();
        table = new HashMap<>();
    }

    private double GetValue(String name) throws UninitializedValue{
        if(Helper.IsNumber(name))
            return Double.parseDouble(name);
        if(table.get(name) == null)
            throw new UninitializedValue();
        return table.get(name);
    }

    public double GetArgument() throws ContextExeption {
        if(stack.isEmpty())
            throw new PopEmptyStack();
        return GetValue(stack.pop());
    }

    public void PutParameter(String name, Double value) {
        table.put(name, value);
    }

    public double PeekArgument() throws ContextExeption{
        if(stack.isEmpty())
            return 0;
        return GetValue(stack.peek());
    }

    public void PutArgument(Double value){
        stack.push(value.toString());
    }

    public void PutArgument(String value){
        stack.push(value);
    }
}
