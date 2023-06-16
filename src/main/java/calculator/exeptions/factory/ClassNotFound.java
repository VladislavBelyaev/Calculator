package main.java.calculator.exeptions.factory;

import main.java.calculator.exeptions.CalculatorExeption;
import main.java.calculator.exeptions.FactoryExeption;

public class ClassNotFound extends FactoryExeption {

    public ClassNotFound(){
        super(" class not found");
    }
}
