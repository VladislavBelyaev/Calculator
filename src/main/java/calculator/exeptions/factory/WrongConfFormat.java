package main.java.calculator.exeptions.factory;

import main.java.calculator.exeptions.CalculatorExeption;
import main.java.calculator.exeptions.FactoryExeption;

public class WrongConfFormat extends FactoryExeption {

    public WrongConfFormat(){
        super(" wrong configure file format\n");
    }
}
