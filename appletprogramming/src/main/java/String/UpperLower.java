package String;
import java.util.*;
class UpperLower
{
     public static void main(String[] args)
     {
          int count = 0;
          Scanner scn = new Scanner(System.in);
          System.out.print("Enter a string: ");
          String str = scn.nextLine();
          System.out.println("Upper case characters: ");
          for (int i = 0; i< str.length(); i++ )
          {
               if (Character.isUpperCase(str.charAt(i)))
               {
                    System.out.print(str.charAt(i)+", ");
               }
          }
          System.out.println("\nLower case characters: ");
          for (int i = 0; i< str.length(); i++ )
          {
               if (Character.isLowerCase(str.charAt(i)))
               {
                    System.out.print(str.charAt(i)+", ");
               }
          }
     }
}