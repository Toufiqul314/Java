package collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        System.out.println("hello world");

        /*creating collection
        1.type safe-same type of elements(objects)are added to collection
        2.un type safe-different types of elements can be addet to collection
        
         */
        //type safe collection
        ArrayList<String> names = new ArrayList<String>();
        names.add("Toufiqul");
        names.add("tusher");
        names.add("islam");
        names.add("toufiqul");
        System.out.println(names);
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
//        //un type safe
//        LinkedList list=new LinkedList();

//        list.add("kawser");
//        list.add(101);
//        list.add(62.12);
//        list.add(true);
//        System.out.println(list);
        //remove
        names.remove("toufiqul");
        System.out.println(names);

        System.out.println("size = " + names.size());
        //check item is there or not
        System.out.println(names.contains("oufiqul"));

        //check of empy
        System.out.println(names.isEmpty());

        //setting value
        //names.set(1, "Arman");
        names.add(1, "adnan");
        System.out.println(names);
        //remove all elements
        //names.clear(); 
        System.out.println(names);

        Vector<String> vector = new Vector<String>();
        vector.addAll(names);
        System.out.println("vector =" + vector);

        System.out.println("-------------------------------");

        HashSet<Double> nms = new HashSet<Double>();
        nms.add(14.12);
        nms.add(36.1234);
        nms.add(new Double(123.42));
        nms.add(20.1);

        System.out.println(nms);
        
        TreeSet<Double>test=new TreeSet<>();
        test.addAll(nms);
        System.out.println(test);

    }

}
