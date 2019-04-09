package com.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortingsettree {
	void settree() {
	SortedSet<String>names=new TreeSet<>();
	names.add("jai");
	names.add("lava");
	names.add("kusa");
	names.add("ravana");
	names.add("ram");
	System.out.println("sorted set tree values:"+names);
	System.out.println("first name in tree set:"+names.first());
	System.out.println("last word in tree set value:"+names.last());

}
}