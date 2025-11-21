package com.example.p4;

public abstract class ArithmeticAbstractClass implements Arithmeticinterface{

	AddDto dto;
	
	@Override
	public void display() {
		
		System.out.println(dto.getNum1()+" "+dto.getNum2()+" "+ dto.getNum3());
		
	}

	@Override
	public void setData(AddDto dto) {
		
		this.dto = dto;
		
	}

}
