package collections;
import java.util.*;
public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("toufiqul");
        names.add("tusher");
        names.add("arman");
        names.add("kawser");
        
        //for each loop
        for(String str:names){
            System.out.print(str+"\t "+str.length());
            StringBuffer br=new StringBuffer(str);
            System.out.println(" "+br.reverse());
        }
        System.out.println("----------------------");
        //traversing using iterator
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String next=iterator.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++++++++++++");
        //backword traversal of collection listiterator
        ListIterator<String> listit = names.listIterator(names.size());
        while(listit.hasPrevious()){
            String previous=listit.previous();
            System.out.println(previous);
        }
        System.out.println("------------For each method------------");
        //for each method
        names.forEach(e->{
            System.out.println(e);
        });
        
        System.out.println("sorting of elements");
        TreeSet<String>set=new TreeSet<>();
        set.addAll(names);
        set.forEach((t) -> {
            System.out.println(t);
        } );
    }
    
}
