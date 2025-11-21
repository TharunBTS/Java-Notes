package com.example.p2;

public class Demo4 {

	public static void main(String[] args) {
		
		Arithmetic a = new Add();
		
		a.setData(6, 7);
		a.cal();
		a.display();
		
		Arithmetic ob[] = {new Add(), new Subtraction(), new Multiplication(), new Division()};
		
	}

}
