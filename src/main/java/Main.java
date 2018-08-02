import Calculator.*;
import MonthPicker.MonthFinder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World and Alex ");

        //static calc requires to call the specific function with 2 variables
        Calculator calculator = new Calculator();
        System.out.println("The sum is: " + calculator.add(3,4));
        System.out.println("The difference is: " + calculator.substract(7,3));
        System.out.println("The product is: " + calculator.multiply(3,2));
        System.out.println("The quotient is: " + calculator.divide(3,2));

        //month-finder static, requires 2 parameters month and year (for February)
        MonthFinder Monthfinder=new MonthFinder();
        System.out.println("So this particular month has: "+Monthfinder.numOfDays(2,2000)+" days.");


        //month-finder dynamic with class variables with static or user input.
        MonthFinder monthfinder2=new MonthFinder(2, 2000);
        monthfinder2.numOfDaysOop();

        //calc dynamic with full expression: arg1 is the first number,
        // arg2 is the second and the 3rd arg is the arithmetical operator
        Scanner scanny=new Scanner(System.in);
        System.out.println("Input first argument- the first number:");
        String Input1=scanny.nextLine();
        System.out.println("Input second argument- the second number:");
        String Input2=scanny.nextLine();
        System.out.println("Input third argument- a mathematical operator (+/-/*/'/':");
        char chary=scanny.nextLine().charAt(0);

        CalcWithArgsCheck argy=new CalcWithArgsCheck();

        argy.Check(Input1,Input2,chary);



    }
}