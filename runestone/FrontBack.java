package runestone;
public class FrontBack
{
   public static String front_back(String str, String start, String end)
   {
      boolean starts = str.startsWith(start);
      boolean ends = str.endsWith(end);

      if (starts && ends) {
          return "s_e";
      } else if (starts) {
          return "s";
      } else if (ends) {
          return "e";
      } else {
          return "n";
      }
  }

   public static void main(String[] args)
   {
      String str1 = "Opening time";
      String start1 = "Open";
      String end1 = "noon";
      System.out.println(front_back(str1, start1, end1));

      String str2 = "Afternoon";
      String start2 = "Open";
      String end2 = "noon";
      System.out.println(front_back(str2, start2, end2));

      String str3 = "Open at noon";
      String start3 = "Open";
      String end3 = "noon";
      System.out.println(front_back(str3, start3, end3));
  }
}

