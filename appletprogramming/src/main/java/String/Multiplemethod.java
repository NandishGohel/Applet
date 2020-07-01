package String;

public class Multiplemethod
{
    public static void main(String[] args)
    {
        String s="Core Java";
        int a=10;
        String s2=String.valueOf(a);
        String s1="  Core Java  ";
        System.out.println("UPPERCASE:");
        System.out.println(s.toUpperCase());
        System.out.println("LOWERCASE:");
        System.out.println(s.toLowerCase());
        
        System.out.print("TRIMMING VALUE:");
        System.out.print("\n"+s1);
        
        System.out.print("\n STARTSWITH VALUE:");
        System.out.print("\n"+s.startsWith("J"));
        System.out.print(s.startsWith("1,i"));
        
        System.out.print("\n ENDSWITH VALUE:");
        System.out.print("\n"+s.endsWith("h"));
        System.out.print(s.endsWith("1,s"));
        
        System.out.print("\n CHARAT VALUE:");
        System.out.print("\n"+s.charAt(0));
        System.out.print("\n"+s.charAt(3));
        
        System.out.print("\n LENGTH VALUE:");
        System.out.print("\n"+s.length());
        
        System.out.print("\n VALUEOF VALUE:");
        System.out.print("\n"+s.valueOf(s2+a));
        
    }
    
}