package com.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Travels {
	List<Orangebus> buslist=new ArrayList<>();
	List<Orangebus>getBussList(){
		Orangebus b=new Orangebus();
		b.busname="Morning star";
		b.busno=1088;
		b.serviceno="675as98";
		b.conditioner="AC";
		b.startingpoint="Bangalore";
		b.destination="piler";
		b.as=new Busoffices();
		b.as.city="Bangalore";
		b.as.area="k.r.puram";
		b.as.landmark="devasandra bus stop";
		buslist.add(b);
	for(Orangebus c:buslist) {
			System.out.println(c.busname+"\n"+c.busno+"\n"+c.serviceno+"\n"+c.conditioner+"\n"+c.startingpoint+"\n"+c.destination+"\n"+c.as.city+"\n"+c.as.area+"\n"+c.as.landmark);
	}
System.out.println("----------------------------------------");
		return buslist;
	}
		void busdemo() {
		Orangebus b1=new Orangebus();
		b1.busname="komitla";
		b1.busno=9652;
		b1.serviceno="rfs876";
		b1.conditioner="NON-AC";
		b1.startingpoint="tirupathi"; 
		b1.destination="chittoor";
		b1.as=new Busoffices();
		b1.as.city="tirupathi";
		b1.as.area="kapilathirtham";
		b1.as.landmark="gandi bus stop";
		buslist.add(b1);
	//	for(Orangebus c:buslist) {
		System.out.println(b1.busname+"\n"+b1.busno+"\n"+b1.serviceno+"\n"+b1.conditioner+"\n"+b1.startingpoint+"\n"+b1.destination+"\n"+b1.as.city+"\n"+b1.as.area+"\n"+b1.as.landmark);
		//}
}
}