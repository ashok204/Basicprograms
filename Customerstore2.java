package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Customerstore2 {
	List<collectionstore>Amazon=new ArrayList<>();
	List<collectionstore>getamazonlist(){
		collectionstore c=new collectionstore();
		c.name="Redmi";
		c.style="Note4";
		c.memory="16gb";
		c.cost=15000;
		c.cc=new Collectionstore1();
		c.cc.bike="pulsar";
		Amazon.add(c);
	for(collectionstore e:Amazon) {
	System.out.println(e.name);
	System.out.println(e.cost);
	System.out.println(e.memory);
	System.out.println(e.style);
	System.out.println(e.cc.bike);
	}
	return Amazon;
		
		
		
		
		
	}

}
 