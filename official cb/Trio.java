//* 2014 FRQ 4*/
import java.text.*;

interface MenuItem
{
    /**
     * @return the name of the menu item
     */
    String getName();

    /**
     * @return the price of the menu item
     */
    double getPrice();
}

class SimpleLunchItem implements MenuItem
{
    private String name;
    private double price;

    public SimpleLunchItem(String aName, double aPrice)
    {
        name = aName;
        price = aPrice;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public String toString()
    {
        DecimalFormat money = new DecimalFormat("0.00");
        return getName() + " " + money.format(getPrice());
    }
}

class Drink extends SimpleLunchItem
{
    public Drink(String name, double price)
    {
        super(name, price);
    }
}

class Salad extends SimpleLunchItem
{
    public Salad(String name, double price)
    {
        super(name, price);
    }
}

class Sandwich extends SimpleLunchItem
{
    public Sandwich(String name, double price)
    {
        super(name, price);
    }
}

// Declare the Trio class.  It must implement the MenuItem interface.
public class Trio implements MenuItem
{
    // declare the instance variables that you need for a trio object
    private Salad salad;
    private Sandwich sandwich;
    private Drink drink;

    // write a constructor that takes a Sandwich, Salad, and a Drink, in that order

    public Trio(Sandwich sand, Salad sal, Drink d){
        sandwich = sand;
        salad = sal;
        drink = d;
    }
    // write the getName method it should return
    // sandwich name/salad name/drink name Trio

    public String getName(){
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";

    }

    // write the getPrice method
    // it should return the price of the two highest price items in the trio.
    public double getPrice(){
        double a = sandwich.getPrice();
        double b = salad.getPrice();
        double c = drink.getPrice();
        if (a >= b && b >= c){
            return (double) a+b;
        }
        else if (a >= c && c>=b){
            return (double) a + c;
        }
        else if(b>= a && a >= c){
            return (double) b+a;
        }else if(b >= c && c>=a){
            return (double) b+c;
        }else if(c>= a && a>=b){
            return (double) c+a;
        }
        // else if(c>=b && b>=a){
        else{
            return (double) a+b;
        }
    }
    public static void main(String[] args)
    {
        Sandwich burger = new Sandwich("Cheeseburger", 2.75);
        Sandwich club = new Sandwich("Club Sandwich", 2.75);
        Salad spinachSalad = new Salad("Spinach Salad", 1.25);
        Salad coleslaw = new Salad("Coleslaw", 1.25);
        Drink orange = new Drink("Orange Soda", 1.25);
        Drink cap = new Drink("Cappuccino", 3.50);
        Trio trio1 = new Trio(burger, spinachSalad, orange);
        System.out.println(
                "It should print Cheeseburger/Spinach Salad/Orange Soda Trio and"
                    + " it prints: "
                        + trio1.getName());
        System.out.println(
                "It should print 4.0 and it prints: " + trio1.getPrice());
        Trio trio2 = new Trio(club, coleslaw, cap);
        System.out.println(
                "It should print Club Sandwich/Coleslaw/Capuccino Trio and it"
                    + " prints: "
                        + trio2.getName());
        System.out.println(
                "It should print 6.25 and it prints: " + trio2.getPrice());
    }
}

