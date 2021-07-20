package com.poly.bean.lab3;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student3Validate {

	@NotBlank(message = "Khong de trong email")
	@Email(message = "khong dung dinh dang email")
	String email;
	@NotBlank(message = "Khong de trong ho va ten")
	String fullname;
	@NotNull(message = "khong de trong diem")
	@PositiveOrZero(message = "diem phai >= 0")
	@Max(value = 10, message = "diem phai <= 10")
	Double marks;
	@NotNull(message = "chon gioi tinh")
	Boolean gender;
	@NotBlank(message = "chon quoc tich")
	String country;
}
