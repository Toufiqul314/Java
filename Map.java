package collections;
import java.util.*;
public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer>courses=new HashMap<>();
        //adding
        courses.put("Core Java",5000);
        courses.put("Basic Python",4000);
        courses.put("Spring", 8000);
        courses.put("Android", 4500);
        courses.put("PHP",3000);
        System.out.println(courses);
        
        //for each 
        courses.forEach((e1,e2)->{
            System.out.println(e1+"=>"+e2);
        });
    }
    
}
