package runestone;
public class DateStylishness
{
   public static int dateFashion(int you, int date)
   {
       if (Math.min(you, date) <= 2){
           return 0;
       }
           else if (you >= 8 || date >=8){
           return 2;
       }else{
       return 1;}
   }

   public static void main(String[] args)
   {
      System.out.println(dateFashion(5, 10));
      System.out.println(dateFashion(8, 2));
      System.out.println(dateFashion(5, 5));
  }
}


