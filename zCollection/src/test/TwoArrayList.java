package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class TwoArrayList {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList();
    al.add("suraj");
    al.add("aniket");
    al.add("kabutar");
    ArrayList<String> al2=new ArrayList();
    al.add("Balu");
    al.add("Shahaji");
    al.add("Ram");
    al.addAll(al2);
   
    Collections.sort(al);
    al.forEach((a)->{
    	System.out.println(a);
    });
    
    System.out.println("Using List Iterator");   
  
    
    
 }
}
