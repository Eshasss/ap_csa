//* 2010 FRQ2 */
public class APLine {


    /** Declare instance variables */
    private int a;
    private int b;
    private int c;

    /** Constructor with 3 int parameters. */

    public APLine(int ax, int bx, int cx){
        a = ax;
        b = bx;
        c = cx;
    }

    /** method getSlope(): Determine the slope of this APLine. */

    public double getSlope(){
        if (b==0){
            return 0;
        }
        return (double) -a/b;
    }

    /** method isOnLine(x,y): Determine if coordinates (x,y) represent a point on this APLine. */

    public boolean isOnLine(double x, double y){
        if (a*x + b* y + c == 0){
            return true;
        }
        return false;
    }

    /** Test with this main method */
    public static void main(String[] args)
    {
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope(); // slope1 is assigned -1.25
        boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) = 0

        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope(); // slope2 is assigned 0.625
        boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 != 0
        // Should print out true and false
        System.out.println(onLine1 + " " + onLine2);
     }

}
