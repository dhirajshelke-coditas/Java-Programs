package Week2Assignments.assignment9;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Asisgnment9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       Map<Integer, String> h1= new HashMap<>();
       
       Map<Integer, String> h2= new LinkedHashMap<>();
       
       Map<Integer, String> h3= new TreeMap<>();

       h1.put(1, "Dhiraj shelke");
       h1.put(2, "Rahul Verma");
       h1.put(3, "Rajesh seth");
       h1.put(4, "Sonu Kumar");
       h1.put(5, "Karan Singh");

       
       h2.put(1, "Dhiraj shelke");
       h2.put(2, "Rahul Verma");
       h2.put(3, "Rajesh seth");
       h2.put(4, "Sonu Kumar");
       h2.put(5, "Karan Singh");
       
       
       h3.put(1, "Dhiraj shelke");
       h3.put(2, "Rahul Verma");
       h3.put(3, "Rajesh seth");
       h3.put(4, "Sonu Kumar");
       h3.put(5, "Karan Singh");
       

       Set<Map.Entry<Integer, String>> entrySet1= h1.entrySet();
       
               System.out.println("This is from Hashmap");
          for (Map.Entry<Integer, String> i : entrySet1) {    
    System.out.println(i);
}
    System.out.println();
              Set<Map.Entry<Integer, String>> entrySet2= h1.entrySet();
              System.out.println("This is from LinkedHashSet");
              for (Map.Entry<Integer, String> i : entrySet2) {    
        System.out.println(i);
    }
              
              System.out.println();
              Set<Map.Entry<Integer, String>> entrySet3= h1.entrySet();
              System.out.println("This is from TreeSet");
              for (Map.Entry<Integer, String> i : entrySet3) {    
        System.out.println(i);
    }
    }

}