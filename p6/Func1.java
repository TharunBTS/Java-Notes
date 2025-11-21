package com.example.p6;

public class Func1<T> {
	
	public String method1(T num)
	{
		String s = ""+num;
		if( num instanceof Float)
		{
			
		}
		StringBuffer sb = new StringBuffer(s);
		return sb.toString();
	}
	
	public int f1(int a,int b)
	{
		return 0;
	}
	public int f2 (int c,int d)
	{
		return 0;
	}

}
