package com.poly.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.poly.bean.Student;

public class Lambda {

	static List<Student> list = Arrays.asList(
			new Student("Nguyen thi A", true , 9.5),
			new Student("Nguyen thi b", false , 8.5)
			);
	@FunctionalInterface
	interface Demo4Inter{
		void m1(int x);
		default void m2() {}
		public static void m3() {}
	}
	
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
		
	}
	
	private static void demo4() {
		Demo4Inter o = x -> System.out.println(x);
		o.m1(2021);
		
	}

	private static void demo3() {
		//" " la giam dan
		//"-" la tang dan
		Collections.sort(list,(sv1, sv2) -> -sv1.getMarks().compareTo(sv2.getMarks()));
		list.forEach(sv -> {
			System.out.println("-> Name:" + sv.getName());
			System.out.println("-> Marks:" + sv.getMarks());
			System.out.println("-----");
		});
	}
	private static void demo2() {
		
		list.forEach(sv -> {
			System.out.println("-> Name: " + sv.getName());
			System.out.println("-> Marks:" + sv.getMarks());
			System.out.println("-----");
		});
	}
	
	private static void demo1() {
		List<Integer> list = Arrays.asList(1,10,2,5,8,3,9,6,4,8);
		list.forEach(n -> System.out.println(n));
	}
}
