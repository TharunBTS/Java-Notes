package com.example.p4;

public class Demo6 {

	public static void main(String[] args) {
		
		AddDto dto = new AddDto();
		dto.setNum1(40);
		dto.setNum2(30);
		
		ArithmeticAbstractClass obj = new Add();
		obj.setData(dto);
		obj.cal();
		obj.display();
		
		obj = new Sub();
		obj.setData(dto);
		obj.cal();
		obj.display();

	}

}
