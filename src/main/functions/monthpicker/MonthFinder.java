package monthpicker;

/**
 * Prints the number of days in a month, based on an input
 */


public class MonthFinder {
    private int month;
    private int year;

    public MonthFinder(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public MonthFinder() {
    }

    public void numOfDaysOop() {
        int year = this.year;
        int month = this.month;

        int daysNumber = 0;

        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 == 0) {
                    daysNumber = 29;
                } else {
                    daysNumber = 28;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysNumber = 30;
                break;

            default:
                daysNumber = 31;
                break;
        }

        System.out.println(daysNumber);
    }

    /**
     * Function that reveals the number of days in a month
     *
     * @param year  the year
     * @param month the month, in numerals
     * @return the number of days in the month
     */


    public int numOfDays(int month, int year) {
        int daysNumber = 0;

        switch (month) {
            case 2:
                if (year % 4 == 0 && year % 100 == 0) {
                    daysNumber = 29;
                } else {
                    daysNumber = 28;
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysNumber = 30;
                break;

            default:
                daysNumber = 31;
                break;
        }

        return daysNumber;
    }

}


