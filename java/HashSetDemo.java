import java.util.*;  
public class HashSetDemo{  
public static void main(String args[]){   
HashSet<String> set=new HashSet<String>();  
set.add("Ram");  
set.add("Hari");  
set.add("Ram");  
set.add("Ajay");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  


