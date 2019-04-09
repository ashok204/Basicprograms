package com.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Collectionshetro {
	List<Student> studentlist = new ArrayList<>();
	List<Student> getStudentList() {
		Student s = new Student();
		s.id = 6554757;
		s.name = "hari";
		s.email = "www.google.com";
		s.aa=new Address();
		s.aa.houseno=3785;
		s.aa.street="kola street";
		s.aa.location="town club";
		s.aa.city="tirupathi";
		s.aa.dist="chittoor";
		s.aa.state="A.P";
		//studentlist.add(s);
		Student sl = new Student();
		sl.id = 48454;
		sl.name = "kiran";
		sl.email = "kumar111@gmail.com";
		studentlist.add(s);
		studentlist.add(sl);
		for (Student a : studentlist) {
			System.out.println(a.id);
			System.out.println(a.name);
			//System.out.println(a.aa.city);
		}
Student ss=studentlist.get(0);
System.out.println(ss.name);
System.out.println(ss.aa.city);
		return studentlist;
	}
}
