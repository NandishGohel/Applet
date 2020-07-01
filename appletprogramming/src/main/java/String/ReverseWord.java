package String;
import java.util.Scanner;
class ReverseWordofString
{
      public static String reverseString(String s)
      {
            String[] str1 = s.split(" ");
            String result1 = "";
            for (int i = str1.length-1; i >= 0; i--)
            {
                   result1 += str1[i]+" ";
            }
            return result1;
      }
      public static void main(String args[])
      {
           Scanner scn = new Scanner(System.in);
           System.out.println("Enter the String: ");
           String str = scn.nextLine();
           String result = ReverseWordofString.reverseString(str);
           System.out.println("\nGiven String: "+str);
           System.out.println("\nReverse String: "+result);
     }
}