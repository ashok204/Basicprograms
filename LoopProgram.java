package com.regnant;

public class LoopProgram {

	public static void main(String[] args) {
		//Print 1 to 10 numbers

		System.out.println("one to ten");
	for (int a=1;a<=10;a++) {
		System.out.println(a);
	}
	//Print 10 to 1 numbers

System.out.println("ten to one");
for (int b=10;b>=1;b--) {
	System.out.println(b);
}
//Print even numbers


System.out.println("even numbers 1-20");
int c;
for(c=1;c<=20;c++) {
	if(c%2==0) {
		System.out.println(c);
	}
}
//Print odd numbers
System.out.println("Print odd numbers");
int d;
for(d=1;d<20;d++) {
	if(d%2!=0) {
		System.out.println(d);
	}
}
//Print alternative numbers from 1 to 20
System.out.println("Print alternative numbers from 1 to 20");
for(int e=1;e<20;e++) {
	if(e%2!=0) {
	System.out.println(e);
}
	}
//Print numbers divisible by 7
System.out.println("Print numbers divisible by 7");
for(int f=1;f<50;f++) {
	if(f%7==0) {
		System.out.println(f);
		
	}
}
//Print prime numbers
System.out.println("Print prime numbers");
int n=20;
for(int i=1; i<=n; i++) {
	int prm=0;
	for(int j=1; j<=i; j++) {
		if(i%j==0) 
			prm++;
			
		}
		if(prm==2) {
	System.out.println(i);

}

	}
/*System.out.println("printprime");
int n=20;
for(int i=1; i<=n;i++) {
	int prm=0;
	for(int j=1; j<=i; j++) {
		if(i%j==0)
			prm++;
	}
	if(prm==2)
		System.out.println(i);
	}*/
}
}




