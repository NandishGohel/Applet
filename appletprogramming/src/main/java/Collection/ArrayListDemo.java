package Collection;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args)
	{
		ArrayList<String>a1=new ArrayList<String>();
		System.out.println("Size of ArrayList:"+a1.size());
		a1.add("Core");
		a1.add("Java");
		System.out.println("Elements of first ArrayList:"+a1);
		ArrayList<String>a2=new ArrayList<String>();
		a2.add("Core1");
		a2.add("Java2");
		
		a2.addAll(a1);
		System.out.println("Elements of second ArrayList:"+a2);
		
		a2.remove("Core1");
		System.out.println("Elements of ArrayList after deletion:"+a2);
		System.out.println("Size of ArrayList:"+a2.size());
		System.out.println("The element at 2nd index is:"+a2.get(2));
	}

}
