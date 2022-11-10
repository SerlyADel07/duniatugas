package com.bcafinance.daykeempat;

public class TugasLangsung {

	public static void main(String[] args) {
		
		int keyword = 88;
		int[] val = {66,77,80,84,88,99,100};
		int low = 0;
		int high = val.length-1;
		int med = 0;
		boolean status = false;
				
		while(low <=high) 
		{
			med = (low+high)/2;
			if(keyword==val[med]) 
			{
				System.out.println(keyword+ "FOUNDED in position" +(med+1)+" and INDEX" +med);
				status = true;
				break;
				
			}else 
			{
				if(keyword>val[med]) 
				{
					low = med + 1;
				}else
				{
					high = med - 1;
				}
			}
				
		}
		
		if(!status) 
		{
			System.out.print(keyword+ "NOT FOUND !!");
		}
	}

}
