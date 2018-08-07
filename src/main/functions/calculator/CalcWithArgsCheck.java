package calculator;

/**
 * calculator implementation with 4 functions with class variables, it takes
 * 3 inputs, the first variable, the second variable and the operator.
 * It can add, substract, multiply and divide 2 numbers.
 */

public class CalcWithArgsCheck {

    private boolean xCorrect = false;
    private boolean yCorrect = false;
    private int checkX = 0;
    private int checkY = 0;
    private char z;



    /**
     * Function that checks the arguments provided by the users, to make sure they're valid inputs
     *
     * @param x first number to calculate
     * @param y second number to calculate
     * @param z the character used to calculate
     */

    public void check(String x, String y, char z) {

        try {
            this.checkX = Integer.parseInt(x);  //taking in an integer input throws NumberFormat Exception if not an integer
            this.xCorrect = true;
        } catch (NumberFormatException e) {   //is input is not an integer, occurs while parsing the command line input argument
            System.out.println("Your input is not a number");

        } catch (ArrayIndexOutOfBoundsException e) { //as takes in input from command line which is stored to a Args array in main, if this array is null implies no input given
            System.out.println("Please enter a number on the command line");
        }

        try {
            if(z== '/' && checkY==0){
                throw new IllegalArgumentException("Second input is 0");
            }
           this.checkY = Integer.parseInt(y);
           this.yCorrect = true;//taking in an integer input throws NumberFormat Exception if not an integer
        } catch (NumberFormatException e) {   //is input is not an integer, occurs while parsing the command line input argument
            System.out.println("Your input is not a number");

        } catch (ArrayIndexOutOfBoundsException e) { //as takes in input from command line which is stored to a Args array in main, if this array is null implies no input given
            System.out.println("Please enter a number on the command line");
        }

        this.z=z;

        if (xCorrect && yCorrect){
            calculateCheckOk(checkX,checkY,z);
        }
        }

    /**
     * Function that executes the mathematical operation if the inputs were considered valid by the previous function's check.
     *
     * @param x first number to calculate
     * @param y second number to calculate
     * @param z the character used to calculate
     * @return N/A
     */

        private void calculateCheckOk(int checkX, int checkY, char z){
            double result;
            if (xCorrect && yCorrect) {
                switch (z) {
                    case '+':
                        result = checkX + checkY;
                        break;
                    case '-':
                        result = checkX - checkY;
                        break;
                    case '*':
                        result = checkX * checkY;
                        break;
                    case '/':
                        result = checkX / checkY;
                        break;
                    default:
                        result = 0;
                }

                System.out.println("The result of the arithmetic operator " + "'" + z + "'" + " and the ints " + checkX + " and " + checkY + " is: " + result + ".");


            }
        }

}
