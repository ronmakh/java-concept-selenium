package com.paynet.datatypes;

public class DatatypesDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,50,23,7,56,68,22,88,36,74,95};
		
		for(int i=0;i<11;i++)
		{
			if (numbers[i]<=50) {
				System.out.println(numbers[i]);
			}
		}	
			String[] fruits= {"grapes","apple","banana","mango"};
			for(String val: fruits)
			{
				System.out.println(val);
			}
		
	}

}
