//* 2008 FRQ 2 */
import java.util.*;

class StringPart
{
    private int start;
    private int len;

    public StringPart(int theStart, int theLen)
    {
        // initialise instance variables
        start = theStart;
        len = theLen;
    }

    public StringPart()
    {
        start = 0;
        len = 0;
    }

    public int getStart()
    {
        return start;
    }

    public int getLength()
    {
        return len;
    }

    public String toString()
    {
        return "(" + getStart() + ", " + getLength() + ")";
    }
}

public class StringCoder
{

    private String masterString;

    /** Constructor for objects of class StringCoder */
    public StringCoder()
    {
        masterString = "sixtyzipperswerequicklypickedfromthewovenjutebag";
    }

    public StringCoder(String master)
    {
        masterString = master;
    }

    /**
     * @param parts an ArrayList of string parts that are valid in the master
     *     string Precondition: parts.size() > 0
     * @return the string obtained by concatenating the parts of the master string
     */
    public String decodeString(ArrayList<StringPart> parts)
    {
        String answer = "";
        for (StringPart s: parts){
            answer += masterString.substring(s.getStart(), s.getStart()+s.getLength());
        }
        return answer;
    }


    private StringPart findPart(String str)
    {
        int start = 0;
        int length = 0;
        for (int len = 1; len <= str.length(); len++)
        {
            int found = masterString.indexOf(str.substring(0, len));
            if (found != -1)
            {
                start = found;
                length = len;
            }
        }
        return new StringPart(start, length);

    }
        /**
     * @param word the string to be encoded Precondition: all of the characters in
     *     word appear in the master string; word.length() > 0
     * @return an ArrayList of string parts of the master string that can be
     *     combined to create word
     */
    public ArrayList<StringPart> encodeString(String word)
    {


    }

    public static void main(String[] args)
    {
        ArrayList<StringPart> overeager = new ArrayList<StringPart>();
        overeager.add(new StringPart(37, 3));
        overeager.add(new StringPart(14, 2));
        overeager.add(new StringPart(46, 2));
        overeager.add(new StringPart(9, 2));
        System.out.println("overeager is encoded as " + overeager);
        StringCoder key = new StringCoder();
        System.out.println(
                "Decoding we get "
                        + key.decodeString(overeager)
                        + " and should be overeager");
    }
}


