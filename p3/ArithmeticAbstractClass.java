package com.example.p3;

public abstract class ArithmeticAbstractClass implements ArithmeticInterface{
	
	int num1;
	int num2;
	int num3;

	@Override
	public void setData(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		
	}


	@Override
	public void display() {
		
		System.out.println(this.num3);
		
	}

}
