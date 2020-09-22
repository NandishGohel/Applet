package Packages;

interface Interface
{
    void Interest(double principle,int year,double rate);
}
class Simple implements Interface    
{
    public void Interest(double p,int y,double r)
    {
        double intr,total;
        intr=p*y*r/100;
        total=p+intr;
        System.out.print("\nPrinciple amount:"+p);
        System.out.print("\nNo. of Years:"+y);
        System.out.print("\nSimple Interest Rate:"+r);
        System.out.print("\nThe Interest amount:"+intr);
        System.out.print("\nTotal Amount After years:"+y+total);
    }
}
class Coumpound implements Interface
{
    public void Interest(double p,int y,double r)
    {
        double intr,total;
        intr=p*Math.pow(1+r/100.0,y);
        total=p-intr;
        System.out.print("\nPrinciple amount:Rs"+p);
        System.out.print("\nNo. of Years:"+y);
        System.out.print("\nCoumpound Interest amount:"+r);
        System.out.print("\nInterest amount:"+intr);
        System.out.print("\nTotal amount After years:"+y+total);
    }
}
class InterestCal
{
    public static void main(String args[])
    {
        int yyears=5;
        double p=5000,srate=5.5,crate=4.5;
        Simple sim=new Simple();
        Coumpound com=new Coumpound();
        sim.Interest(p,yyears,srate);
        com.Interest(p,yyears,crate);
    }
}