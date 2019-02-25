package com.regnant;

public class ArrayPrograms {

	public static void main(String[] args) {
		//Print array elements
	System.out.println("Print array elements");
	int array[]= {12,3,65,36,5,4,8,9,78};
	for(int i:array) {
		System.out.println(i);
	}
	

	//Print even numbers in array
	System.out.println("Print even numbers in array");
	int arrays[]= {25,24,6,8,9,7,9,8,5,6,2,1};
	for(int j=0;j<arrays.length;j++) {
		
		if(arrays[j]%2==0) {
			System.out.println(arrays[j]);
		}
	}
	
	System.out.println("Print odd numbers in array");
	int arrays1[]= {25,24,6,8,9,7,9,8,5,6,2,1};
	for(int h=0;h<arrays1.length;h++) {
		
		if(arrays1[h]%2!=0) {
			System.out.println(arrays1[h]);
		}
	}
	

//Print elements at even index in array
	System.out.println("Print elements at even index in array");
	int array2[]= {52,4,6,9,7,52,41,11,22,44};
	for(int i=0;i<array2.length;i++) {
		if(i%2==0) {
			System.out.println(array2[i]);
		}
	}
	//Print elements at odd index in array
System.out.println("Print elements at odd index in array");
int array3[]= {2,1,2,55,8,9,56,2,3};
for(int a=0;a<array3.length;a++) {
	if(a!=0) {
		System.out.println(array3[a]);
	}
}
//middle to left array
System.out.println("middle to left");
int left[]= {1,2,3,4,5,6,7,8,9};
for(int b=left.length/4;b>left.length;b--) {
System.out.println(left[b]);
}

//middle to right array
System.out.println("middle to right");
int right[]= {1,2,3,4,5,6,7,8,9};
for(int j=right.length/2;j<right.length;j++) {
System.out.println(right[j]);

//Print the Alternate Elements in an Array
System.out.println("Print the Alternate Elements in an Array");
int alter[]= {2,5,3,6,4,77,85,8,91};
for(int c=0;c<alter.length;c=c+2) {
	System.out.println(alter[c]);
}
//Find the index of a given element
System.out.println("Find the index of a given element");
int index[]= {5,6,9,8,7,7,85,56,2};
int e=85;
for(int d=0;d<index.length;d++ ) {
	if(index[d]==e) {
		System.out.println(d);
	}
	
}
//Calculate Sum & Average of an Array
System.out.println("Calculate Sum & Average of an Array");
int some[]= {52,7,8,4,5,6,3,4,5};
int f=0;
for(int m=0;m<some.length;m++) {
	f=some[m]+f;
	System.out.println("some"+f);
	int o=f%some.length;
	System.out.println("avg"+o);
	
}
	}

}
}