package com.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Iteratormap {
	Map<Integer,String>user=new HashMap<>() ;
		void mapdemo() {
			user.put(1,"danu");
			user.put(2,"mouli");
			user.put(3,"janu");
			user.put(4,"hema");
			user.put(5,"bindu");
			System.out.println("before maping elements");
		}
		void mapentry() {
			for(Map.Entry entry:user.entrySet()) {
				Integer i=(Integer)entry.getKey();
				String s=(String)entry.getValue();
				System.out.println(i+" "+s);
		}
	}
		Set<Integer>KeySet=user.keySet();
		void demo() {
			System.out.println("while loop programs result set");
			Iterator it=KeySet.iterator();
			while(it.hasNext()) {
				Integer i=(Integer)it.next();
				String s=(String)user.get(i);
				System.out.println(i+" "+s);
			}
		}
		void enhancedloop() {
			for(Integer i:KeySet) {
				String s=user.get(i);
          System.out.println(i+" "+s);
			}
		}
	
	}
