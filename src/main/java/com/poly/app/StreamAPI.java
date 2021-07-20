package com.poly.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.poly.bean.Student;

public class StreamAPI {

	static List<Student> list = Arrays.asList(
			new Student("Nguyen thi A", true , 9.5),
			new Student("Nguyen thi b", false , 8.5)
			);
	
	public static void main(String[] args) {
		demo1();
		demo2();
		demo3();
		demo4();
	}

	private static void demo4() {
		double average = list.stream()
				.mapToDouble(sv -> sv.getMarks())
				.average().getAsDouble();//tinh trung binh
		System.out.println("average:" + average);
		
		double sum = list.stream()
				.mapToDouble(sv -> sv.getMarks())
				.sum();//tinh tong diem
		System.out.println("sum:" + sum);
		
		double min_marks = list.stream()
				.mapToDouble(sv -> sv.getMarks())
				.min().getAsDouble();//diem thap nhat
		System.out.println("min_marks:" + min_marks);
		
		boolean all_passed = list.stream().allMatch(sv -> sv.getMarks() >= 5);// tat ca diem tren 5 hay khong
		System.out.println("all_passed:" + all_passed);
		
		Student min_sv = list.stream()
				.reduce(list.get(0), (min, sv) -> sv.getMarks() < min.getMarks() ? sv : min);// tim sv co diem thap nhat
		System.out.println("min_sv:" + min_sv.getName());
		
	}

	private static void demo3() {
		List<Student> result = list.stream()
				.filter(sv -> sv.getMarks() >= 7)
				.peek(sv -> sv.setName(sv.getName().toUpperCase()))
				.collect(Collectors.toList());
		
		result.forEach(sv -> {
			System.out.println("-> Name:" + sv.getName());
			System.out.println("-> Marks:" + sv.getMarks());
			System.out.println("-----");
		});
		
	}

	private static void demo2() {
		List<Integer> list = Arrays.asList(1,9,2,8,3,7,4,6,5);
		List<Double> result = list.stream()//Stream<Integer>
				.filter(n -> n%2 == 0)//Stream<Integer> loc cac so chan
				.map(n -> Math.sqrt(n))//Stream<Double> chuyen doi
				.peek(d -> System.out.println(d))//Stream<Double> dong vai tro nhu vong for
				.collect(Collectors.toList());//List<Double>
		
	}

	private static void demo1() {
		Stream<Integer> stream1 = Stream.of(1,9,2,8,3,7,4,6,5);
		stream1.forEach(n -> {
			System.out.println(n);
		});
		
		List<Integer> list = Arrays.asList(1,9,2,8,3,7,4,6,5);
		//Stream<Inteager> stream2 = list.stream();
		list.stream().forEach(n -> {
			System.out.println(n);
		});
		
	}
	
}


