package com.java.MapInterface;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapVsWeakHashMapExample{

	public static void main(String[] args) throws InterruptedException {
//		 HashMap m = new HashMap();
		 WeakHashMap m = new WeakHashMap();
	        Demo d = new Demo();
	         
	        // puts an entry into HashMap
	        m.put(d," Hi "); 
	         
	        System.out.println(m); 
	        
	        d = null;
	         
	        // garbage collector is called
	        System.gc();	
	         
	        //thread sleeps for 4 sec
	        
	        Thread.sleep(4000); 
	         
	        System.out.println(m);
	}

}
class Demo 
{
    public String toString()
    {
        return "demo";
    }
     
    // finalize method
    public void finalize()
    {
        System.out.println("Finalize method is called");
    }
}