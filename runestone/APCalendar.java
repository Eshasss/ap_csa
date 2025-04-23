package runestone;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class APCalendar
{
    /**
     * Returns true if year is a leap year and false otherwise.
     */
    private static boolean isLeapYear(int year)
    {
        return new GregorianCalendar().isLeapYear(year);
    }

    /**
     * Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2)
    {
        int x = 0;
        for (int i = year1; i <= year2; i++) {
            if (isLeapYear(i)) {
                x++;
            }
        }
        return x;
    }

    /**
     * Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6
     * denotes Saturday. Precondition: The date represented by month, day, year is
     * a valid date.
     */
    public static int dayOfWeek(int month, int day, int year)
    {
        int dayy = dayOfYear(month, day, year);
        int fday = firstDayOfYear(year);
        return (fday + dayy - 1) % 7;
    }

    /**
     * Returns the value representing the day of the week for the first day of
     * year, where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year)
    {
        GregorianCalendar gc = new GregorianCalendar(year, Calendar.JANUARY, 1);
        return gc.get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year. Precondition: The
     * date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year)
    {
        GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
        return gc.get(Calendar.DAY_OF_YEAR);
    }

    public static void main(String[] args)
    {
        int leapAnswer = APCalendar.numberOfLeapYears(2000, 2050);
        System.out.println("Your answer should be 13: " + leapAnswer);

        int dayAnswer = APCalendar.dayOfWeek(1, 8, 2019);
        System.out.println("Your answer should be 2: " + dayAnswer);
    }
}
