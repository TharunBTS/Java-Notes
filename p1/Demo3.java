package com.example.p1;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int r = ip.nextInt();
		int c = ip.nextInt();
		int a[][] = new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = ip.nextInt();
			}
		}

	}
	
//	public void cpCons(Demo3 cc)
//	{
//		System.out.println(cc.a);
//	}

}
