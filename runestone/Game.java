/**
 * Unit 3 FRQ practice
 */
package runestone;
public class Game
{
    /* the Level objects */
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    private boolean bonus;

    /* Complete the getScore() method below */
    public int getScore()
    {
        int score = 0;
        if (levelOne.goalReached()){
            score += levelOne.getPoints();
        }
        if (levelTwo.goalReached()){
            score += levelTwo.getPoints();
        }
        if (levelThree.goalReached()){
            score += levelThree.getPoints();
        }
        if (isBonus()){
            score *= 3;
        }
        return score;
    }


    public Game( int p1, boolean g1, int p2, boolean g2, int p3, boolean g3, boolean b )
    {
        levelOne = new Level( p1, g1 );
        levelTwo = new Level( p2, g2 );
        levelThree = new Level( p3, g3 );
        bonus = b;
    }

    public boolean isBonus()
    {
        return bonus;
    }

    public static void main(String[] args)
    {
        // These are the AP test cases given in the problem description
        Game g1 = new Game(200,true,100,true,500,true,true);
        // This should print out 2400
        System.out.println( g1.getScore() );

        Game g2 = new Game(200,true,100,true,500,false,false);
        // This should print out 300
        System.out.println( g2.getScore() );

        Game g3 = new Game(200,true,100,false,500,true,true);
        // This should print out 600
        System.out.println( g3.getScore() );

        Game g4 = new Game(200,false,100,true,500,true,false);
        // This should print out 0
        System.out.println( g4.getScore() );


    }

}
class Level
{
    private int points;
    private boolean goal;

    /** Constructor for the Level class */
    public Level(int p, boolean g)
    {
        points = p;
        goal = g;
    }

    /** Returns true if the player reached the goal on this level and returns false otherwise */
    public boolean goalReached()
    { return goal; }

    /** Returns the number of points recorded for this level */
    public int getPoints()
    { return points; }
}
