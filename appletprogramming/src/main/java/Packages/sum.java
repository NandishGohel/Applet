package Packages;

interface Numbers
{
    int process(int y,int x);
}
class Sum implements Numbers
{
     public int process(int x,int y)
    {
        return(x+y);
    }
}
class average implements Numbers
{
    public int process(int x,int y)
    {
        return((x+y)/2);
    }
}
class NumbersCal
{
    public static void main(String args[])
    {
        int a,b;
        Sum s=new Sum();
        a=s.process(9,10);
        System.out.print("\nSum is:"+a);
        average avg=new average();
        b=s.process(80,90);
        System.out.print("\nAverage is:"+b);
        
    }
}