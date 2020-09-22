package Packages;

interface Printable
{
    void print();
}
interface Showable
{
    void show();
}
class multiple implements Printable,Showable
{
    public void print(){System.out.print("\n Hello");}
    public void show(){System.out.print("\n Welcome");}
    public static void main(String args[])
    {
        multiple obj=new multiple();
        obj.print();
        obj.show();
    }
}