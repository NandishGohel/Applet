package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

class HashTable
{
        public static void main(String[] args)
        {
                Hashtable<String, String> hashtabel = new Hashtable<String, String>();
                hashtabel.put("1","First");
                hashtabel.put("2","Second");
                hashtabel.put("3","Third");
                hashtabel.put("4","Forth");
                hashtabel.put("5","Fifth");
                System.out.println("Size of Hashtable: "+hashtabel.size());
                System.out.println("Hashtable in empty: "+hashtabel.isEmpty());
                System.out.println("Elements of the Hashtable:");
                Enumeration value  = hashtabel.elements();
                while (value.hasMoreElements())
                {
                        System.out.println(value.nextElement());
                }
        }
}