package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {
	void priorityqueue() {
		PriorityQueue<String>queue=new PriorityQueue<String>();
		queue.add("tirupathi");
		queue.add("tirumala");
		queue.add("thalakona");
		queue.add("chandtagiri");
		queue.add("piler");
		queue.add("chittoor");
		System.out.println("first elment:"+queue.element());
		System.out.println("last element:"+queue.peek());
		System.out.println("iterate the queue elements:");
		Iterator itr=queue.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}	
	queue.remove();
	queue.poll();
	System.out.println("----------------------------------------");
	System.out.println("after removing two elemants:");
	Iterator <String>itr1=queue.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
}
}
