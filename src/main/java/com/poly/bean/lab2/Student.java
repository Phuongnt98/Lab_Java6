package com.poly.bean.lab2;

import java.util.List;

import com.poly.bean.Contact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	String name;
	boolean gender = false;
	Double marks = 0.0;
	Contact contact;
	List<String> subjects;
}
