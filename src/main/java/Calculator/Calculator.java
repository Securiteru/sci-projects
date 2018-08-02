package Calculator;

/**
 *  Calculator implementation with 4 functions. It can add, substract, multiply and divide 2 numbers.
 */

public class Calculator {

    /**
     * Function that calculates the sum of two integer numbers
     *
     * @param x
     * @param y
     * @return the sum
     */
    public int add(int x, int y) {
        return x + y;
    }

    /**
     * Function that calculates the difference of two integer numbers
     *
     * @param x
     * @param y
     * @return the difference
     */

    public int substract(int x, int y) {
        return x - y;
    }

    /**
     * Function that calculates the product of two integer numbers
     *
     * @param x
     * @param y
     * @return the product
     */

    public int multiply(int x, int y) {
        return x * y;
    }

    /**
     * Function that calculates the quotient of two doubles numbers
     *
     * @param x
     * @param y
     * @return the quotient
     */

    public double divide(double x, double y) {
        return x / y;
    }

}