package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortinglist {
	void sortlist() {
		List<String>strlist=new ArrayList<String>();
		strlist.add("hithesh");
		strlist.add("mahesh");
		strlist.add("bharath");
		strlist.add("uday");
		strlist.add("sunny");
		Collections.sort(strlist);
		for(String str:strlist) {
			System.out.println("sorting the list values:"+str);
		}
		
	}

}
