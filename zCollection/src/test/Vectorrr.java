package test;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Vectorrr {
public static void main(String[] args) {
	Vector<Integer> v=new Vector();
	v.add(70);
	v.add(50);
	v.add(60);
	v.add(55);
	v.add(90);
	v.add(34);
System.out.println(v);
Collections.sort(v);
System.out.println(v);
  Enumeration en=v.elements();
  while(en.hasMoreElements())
  {
	  System.out.println(en.nextElement());
  }
  System.out.println("Using for loop");
  for(int i=0;i<v.size();i++)
  {
	  if(v.get(i)<61)
	  {
		  System.out.println(v.get(i));
	  }
  }
}
}
