public class Main {
    public static void main(String[] args) {
        int inty1 = 5;
        int inty2 = 7;

        System.out.println(inty1 + inty2);
        System.out.println(inty1 - inty2);
        System.out.println(inty1 * inty2);
        System.out.println((double) inty1 / inty2);
        System.out.println(inty1 % inty2);

        if (inty1 == inty2) {
            System.out.println("== works");
        }
        if (inty1 != inty2) {
            System.out.println("!= works");
        }
        if (inty1 > inty2) {
            System.out.println("> works");
        }
        if (inty1 < inty2) {
            System.out.println("< works");
        }
        if (inty1 >= inty2) {
            System.out.println(">= works");
        }
        if (inty1 <= inty2) {
            System.out.println("<= works");
        }

        while (inty1 < inty2) {
            System.out.println("Trying to increase");
            inty1++;
        }
        do {
            System.out.println("Trying to decrease");
        } while (inty1 < inty2);

        int[] numbers = {1, 2, 3, 5, 10, 20, 30, 40, 50};

        for (int x : numbers) {
            if (x == 30) {
                System.out.println("Breaking");
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }

        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.print(x + " round 2:fight");
            System.out.print("\n");
        }


        int a = 60;    /* 60 = 0011 1100 */
        int b = 13;    /* 13 = 0000 1101 */
        int c = 0;

        c = a & b;        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;           /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;       /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;       /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;      /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);


        CalcTest calcy = new CalcTest();
        calcy.Check("1", "5", '+');
    }
}
