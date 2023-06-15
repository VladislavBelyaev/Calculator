package main.java.calculator.other;

public class Helper {
    public static boolean IsNumber(String value){
        try{
            Double.parseDouble(value);
        }
        catch (NumberFormatException ex){
            return false;
        }
        return true;
    }
}
