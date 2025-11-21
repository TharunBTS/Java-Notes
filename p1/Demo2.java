package com.example.p1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		Demo2 obj = new Demo2();
		int num = ip.nextInt();
//		String s = obj.calculateBinary(num);
//		System.out.println("Binary of "+num+" is "+s);6
		int res1 = obj.calculateOctal(num);
		System.out.println("octal of "+num+" is "+res1);
//		int res2 = obj.calculateHexa(num);
//		System.out.println("hexa of "+num+" is "+res2);

	}
	
	public static String calculateBinary(int num)
	{
		StringBuffer sb = new StringBuffer();
		while(num > 0)
		{
			int rem = num % 2;
			sb.append(rem);
			num = num / 2;
		}
		return sb.reverse().toString();
	}
	
	public static long powerValue(int base, String s)
	{
		int ind = 0;
		long sum = 0;
		int bas = (base == 8 ? 8 : base == 2 ? 2 : base == 16 ? 16 : 0);
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i) == '1')
			{
				sum += Math.pow(bas, ind);
			}
			ind++;
		}
		return sum;
	}
	
	public int calculateOctal(int num)
	{
		
		String s= "";
		s = s+ num;
		int sum = 0;
//		if(s.charAt(0) > '7') return 0;
		String res = "";
		for( char c : s.toCharArray())
		{
			int val = c - '0';
			String v =Demo2.calculateBinary(val);
			if(v.length() != 3)
			{
				while(v.length() != 3)
				{
					v = "0" + v;
				}
			}
//			res += v;
			sum += Demo2.powerValue(8, v);
//			System.out.println(res);
		}
		return sum;
	}
	
	public int calculateHexa(int num)
	{
		
		String s= "";
		s = s+ num;
	
		String res = "";
		for( char c : s.toCharArray())
		{
			int val = c - '0';
			String v =Demo2.calculateBinary(val);
			if(v.length() != 3)
			{
				while(v.length() != 4)
				{
					v = "0" + v;
				}
			}
			res += v;
//			System.out.println(res);
		}
		return (int)Demo2.powerValue(16, res);
	}

}
