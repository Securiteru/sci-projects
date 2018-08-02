import Calculator.Calculator;
import MonthPicker.MonthFinder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World ");

        Calculator calculator = new Calculator();
        System.out.println("The sum is: " + calculator.add(3,4));
        System.out.println("The difference is: " + calculator.substract(7,3));
        System.out.println("The product is: " + calculator.multiply(3,2));
        System.out.println("The quotient is: " + calculator.divide(3,2));

        MonthFinder Monthfinder=new MonthFinder();
        System.out.println(Monthfinder.numOfDays(2,2000));

    }
}