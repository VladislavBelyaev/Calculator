package main.java.calculator.factory;

import main.java.calculator.exeptions.FactoryExeption;
import main.java.calculator.exeptions.factory.WrongConfFormat;
import main.java.calculator.operations.Operation;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class OperationFactory {

    private final int operations = 10;
    private HashMap<String, Class<?>> opKit;

    public OperationFactory(InputStream conf) throws FactoryExeption{
        opKit = new HashMap<>();
        Scanner scan = new Scanner(conf);
        try
        {
            for(int i = 0; i < operations; i++)
            {
                String line = scan.nextLine();
                String[] words = line.split(" ");
                if(words.length != 2)
                    throw new WrongConfFormat();
                opKit.put(words[0], Class.forName(words[1]));
            }
            scan.close();
        }
        catch (ClassNotFoundException cnf){
            throw new FactoryExeption();
        }
    }

    public Operation GetOperation(String name) throws FactoryExeption{
        try
        {
            return (Operation) opKit.get(name).newInstance();
        }
        catch (ReflectiveOperationException ex) {
            throw new FactoryExeption();
        }
    }
}
