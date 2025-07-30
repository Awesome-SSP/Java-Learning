import java.util.*;


public class DS {
    public enum Animals
    {
        DOG,
        CAT,
        COW,
        LION

    }

    /**public static void main(String [] args)
    {   
        Animals a = Animals.DOG;

        if( a == Animals.DOG)
        {
            System.out.println("True");
        }

        // lifo (LAST IN FIRST OUT)
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4.9);
        stk.push("Hello");

        System.out.println(stk);
        System.out.println(stk.get(0));
        System.out.println(stk.get(4));

        stk.pop();
        stk.pop();

        System.out.println(stk);


        // Vector data structure

        Vector vec = new Vector();

        vec.addElement(1); // index 0
        vec.addElement(2);  // index 1
        vec.addElement(3);  // index 2
        vec.addElement("Hello");  // index 3
        vec.addElement(34.78);  // index 4
        vec.addElement(4); // index 5
        vec.addElement(5);  // index 6
        vec.addElement(6); // index 7
        vec.addElement(7); // index 8
        vec.addElement(8);  // index 9
        vec.addElement(9);

        System.out.println(vec);
        System.out.println(vec.get(0));
        System.out.println(vec.get(2));

        Enumeration e = vec.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
 
        }
    

        // BitSet data structure

        BitSet b1 = new BitSet(4);
        BitSet b2 = new BitSet(4);

        b1.set(0,true);
        b1.set(1,true);
        b1.set(2,true);
        b1.set(3,true);

        b2.set(0,false);
        b2.set(1,true);
        b2.set(2,true);
        b2.set(3,true);

        System.out.println("B1:" + b1);
        System.out.println("B2: "+ b2);

        // b1.and(b2);
        // b1.or(b2);
        b1.xor(b2);
        
        System.out.println("B1:" + b1);

    }
     */

    /**  public static void main(String [] args)
    {  // Properties use cases
        Properties films = new Properties();

        films.put("Star Wars","Revenge of the Jedi");
        films.put("Batman","The Dark Knight");
        films.put("Lord of the Rings","The Two Towers");

        System.out.println(films);
        System.out.println(films.get("Star Wars"));

        Iterator i  = films.keySet().iterator();

        while(i.hasNext()){
            String key = (String)i.next();
            System.out.println(key +": "+films.getProperty(key));
        }
    }
    */


    // hash table data structure
    public static void main(String[] args){
        Hashtable t = new Hashtable();
        t.put("1","One");
        t.put("2","Two");
        t.put("3","Three");
        t.put("4","Four");

        System.out.println(t);

        Enumeration e = t.keys();

        while(e.hasMoreElements())
        {
            String key = (String) e.nextElement();

            System.out.println(key +": "+t.get(key));
        }
        
    }
}
