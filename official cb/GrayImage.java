public class GrayImage
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
     * Processes this image in row-major order and decreases the value of each
     * pixel at position (row, col) by the value of the pixel at position (row + 2,
     * col + 2) if it exists. Resulting values that would be less than BLACK are
     * replaced by BLACK. Pixels for which there is no pixel at position (row + 2,
     * col + 2) are unchanged.
     */
    public void processImage() {
        for (int i=0; i<pixelValues.length-2; i++){
            for (int j=0; j<pixelValues[0].length-2; j++){

                if(pixelValues[i][j] - pixelValues[i+2][j+2]<BLACK){
                    pixelValues[i][j] = BLACK;

                }else{
                    pixelValues[i][j] -= pixelValues[i+2][j+2];


                }
            }
        }
    }

    public void printValues()
    {
        for (int r = 0; r < pixelValues.length; r++)
        {
            for (int c = 0; c < pixelValues[0].length; c++)
            {
                System.out.print(pixelValues[r][c] + ", ");
            }
            System.out.println();
        }
    }

    /** main for testing */
    public static void main(String[] args)
    {
        int[][] values =
        {
            {221, 184, 178, 84, 135},
            {84, 255, 255, 130, 84},
            {78, 255, 0, 0, 78},
            {84, 130, 255, 130, 84}
        };
        GrayImage image = new GrayImage(values);
        image.printValues();
        image.processImage();
        System.out.println("after process image");
        image.printValues();
    }
}

