//* 2012 FRQ 4A */
public class GrayImageB
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /**
     * The 2-dimensional representation of this image. Guaranteed not to be null.
     * All values in the array are within the range [BLACK, WHITE], inclusive.
     */
    private int[][] pixelValues;

    /** constructor that takes a 2D array */
    public GrayImage(int[][] theArray)
    {
        pixelValues = theArray;
    }

    /**
     * @return the total number of white pixels in this image. Postcondition: this
     *     image has not been changed.
     */
    public int countWhitePixels() {
        int n = 0;
        for (int i=0; i<pixelValues.length; i++){
            for (int j=0; j<pixelValues[0].length; j++){
                if (pixelValues[i][j] == 255){
                    n++;
                }
            }
        }
        return n;

    }

    /** main for testing */
    public static void main(String[] args)
    {
        int[][] values =
        {
            {255, 184, 178, 84, 129},
            {84, 255, 255, 130, 94},
            {78, 255, 0, 0, 78},
            {84, 130, 255, 130, 84}
        };
        GrayImage image = new GrayImage(values);
        System.out.println(
                "count white should be 5 and is " + image.countWhitePixels());
    }
}

