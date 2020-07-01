package String;

public class EqualsCompareto
{
    public static void main(String[] args)
    {
        String s="Core";
        String s1="Core";
        String s2=new String("Java");
        String s3="Java";
        System.out.println(s.equals(s1));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        
        System.out.println(s==s1);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        
        System.out.println(s.compareTo(s1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
    }
    
}