package main.java;

import main.java.calculator.Calculator;
import main.java.calculator.exeptions.CalculatorExeption;

public class Main {
    public static void main(String[] args) {
        try
        {
            Calculator calc = new Calculator(args);
            calc.calculate();
        }
        catch (CalculatorExeption ex){

        }
    }
}