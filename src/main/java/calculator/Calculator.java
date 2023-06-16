package main.java.calculator;

import main.java.calculator.context.Context;
import main.java.calculator.exeptions.CalculatorExeption;
import main.java.calculator.factory.OperationFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Calculator {

    static Logger logger;
    static {
        try
        {
            FileInputStream ins = new FileInputStream("src/main/resources/log.config");
            LogManager.getLogManager().readConfiguration(ins);
            logger = Logger.getLogger(Calculator.class.getName());
        }catch (Exception ex){

        }
    }

    private final String confFileName = "src/main/resources/conf.txt";
    private OperationFactory opFact;
    private Context ctx;
    private InputStream input;

    public Calculator(String[] args) throws CalculatorExeption{
        logger.info("Initiate calculator\n");
        try
        {
            FileInputStream in = new FileInputStream(confFileName);
            opFact = new OperationFactory(in);
            ctx = new Context();
            if(args.length < 2){
                input = new BufferedInputStream(System.in);
            }
            else{
                input = new FileInputStream(args[1]);
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void Interpretate(String command) throws CalculatorExeption {
        logger.info("Do command\n");
        String[] words = command.split(" ");
        String[] args = new String[words.length - 1];
        System.arraycopy(words, 1, args, 0, words.length - 1);
        opFact.GetOperation(words[0]).Do(ctx, args);
    }

    public void calculate(){
        logger.info("Start calculation\n");
        String command;
        Scanner scan = new Scanner(System.in);
        command = scan.nextLine();
        try
        {
            while(command.equals("Exit") == false){
                Interpretate(command);
                command = scan.nextLine();
            }
        }
        catch (CalculatorExeption ex){
            System.out.println(ex.getMessage());
        }
        logger.info("Finish calculation\n");
    }
}
