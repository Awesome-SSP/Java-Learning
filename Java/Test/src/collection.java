import java.util.*;


public class collection
 {
     // List

    /** public static void main(String[] args)
    {

        // two list ArrayList and  LinkedList

        List cars = new ArrayList();
        cars.add("BMW");
        cars.add("Lucid Motors");
        cars.add("Honda");
        cars.add("Lamborgini");

        System.out.println(cars);
        System.out.println(cars.get(0));

        for(int i =0 ; i<cars.size(); i++)
        {
            System.out.println(cars.get(i));
        }



        List cars2 = new LinkedList();
        cars2.add("BMW");
        cars2.add("Lucid Motors");
        cars2.add("Honda");
        cars2.add("Lamborgini");

        System.out.println(cars2);
        System.out.println(cars2.get(0));

        for(int i =0 ; i<cars2.size(); i++)
        {
            System.out.println(cars2.get(i));
        }
    }  */  
   
    // Sets

    /** public static void main(String[] args)
    {
        // Set<Integer> numbers = new HashSet<Integer>();

        // numbers.add(23);
        // numbers.add(7);
        // numbers.add(90);
        // numbers.add(-5);
        // numbers.add(90);
        // numbers.add(1);
        // numbers.add(67);

        // System.out.println(numbers);

        // TreeSet tree = new TreeSet<Integer>(numbers);
        // System.out.println(tree);

        SortedSet sorted = new TreeSet();

        sorted.add(78);
        sorted.add(98);
        sorted.add(0);
        sorted.add(45);
        sorted.add(1000);
        sorted.add(67);
        sorted.add(234);

        System.out.println(sorted);

        Iterator i = sorted.iterator();

        while(i.hasNext())
        {
            Object e = i.next();
            System.out.println(e);
        }  
    } */

    // Map  and Map.Entry  and SortedMap

    /** public static void main(String[] args)
    {
        // Map mappy = new HashMap();

        // mappy.put("key1","Value1");
        // mappy.put("key2","Value2");
        // mappy.put("key3","Value3");
        // mappy.put("key4","Value4");
        // mappy.put("key5","Value5");
        // mappy.put("key6","Value6");
        // mappy.put("key7","Value7");

        // System.out.println(mappy);
        // System.out.println(mappy.get("key6"));

        // Iterator it = mappy.entrySet().iterator();

        // while(it.hasNext())
        // {
        //     Map.Entry m = (Map.Entry) it.next();

        //     System.out.println(m.getKey() + " - " + m.getValue());
        // }


        // Sorted Map
        
        TreeMap mappy = new TreeMap();

        mappy.put("key1","Value1");
        mappy.put("key2","Value2");
        mappy.put("key3","Value3");
        mappy.put("key0","Value4");
        mappy.put("key5","Value5");
        mappy.put("key4","Value6");
        mappy.put("key7","Value7");

        System.out.println(mappy);
        System.out.println(mappy.get("key6"));

        Iterator it = mappy.entrySet().iterator();

        while(it.hasNext())
        {
            Map.Entry m = (Map.Entry) it.next();

            System.out.println(m.getKey() + " - " + m.getValue());
        }
    } */

    // Enumeration

    public static void main(String[] args){
        // Enumeration

        Enumeration months;
        Vector vec = new Vector();

        vec.add("January");
        vec.add("February");
        vec.add("March");
        vec.add("April");
        vec.add("MAy");
        vec.add("June");
        vec.add("July");
        vec.add("August");
        vec.add("September");
        vec.add("October");
        vec.add("Novemeber");
        vec.add("December");

        months = vec.elements();

        while(months.hasMoreElements()){
            System.out.println(months.nextElement());
        }
        

    }

}
