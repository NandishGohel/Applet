package Collection;
import java.util.*;
public class LinkedList1
{
      public static void main(String args[])
      {
             LinkedList<String> a1 = new LinkedList<String>();
             System.out.println("Initial size of LinkedList: "+a1.size());
             a1.add("Junagadh");
             a1.add("Vadodara");
             a1.add("Bengaluru");
             a1.add("Mumbai");
             System.out.println("Element of LinkedList: " + a1);
             System.out.println("Size of LinkedList after addition: "+a1.size());
             a1.remove(2);
             System.out.println("Element of LinkedList after deletion: " + a1);
             System.out.println("Size of the LinkedList after deletion: "+a1.size());
             a1.removeFirst();
             a1.removeLast();
             System.out.println("a1 after deleting first and last: " + a1);
             System.out.println("Size of the LinkedList after deletion: "+a1.size());
             System.out.println("Fisrt element of LinkedList: "+a1.getFirst());
             System.out.println("Last element of LinkedList: "+a1.getLast());

             Iterator<String> itr = a1.iterator();
             while(itr.hasNext())
             {
                   System.out.print(itr.next()+", ");
             }
      }
}