package com.anmol;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
	public static void main(String args[]) {
		  TreeSet tree = new TreeSet();
	      // Create a hash map
	      TreeMap tm = new TreeMap();
	      // Put elements to the map
	      tm.put(45, new Double(3434.34));
	      tm.put(56, new Double(123.22));
	      tm.put(3, new Double(1378.00));
	      tm.put(12, new Double(99.22));
	      tm.put(23, new Double(-19.08));
	      
		  // Get a set of the entries
	      Set set = tm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      // Deposit 1000 into Zara's account
	      double balance = ((Double)tm.get("Zara")).doubleValue();
	      tm.put("Zara", new Double(balance + 1000));
	      System.out.println("Zara's new balance: " +
	      tm.get("Zara"));
	   }
}
