package BasicProgram;

import java.util.Scanner;

public class Smallest {
	int numbers[]= new int[5];
	int smallvalue;
    Scanner scanner= new Scanner(System.in);
	public void getvalue()
	{
		System.out.println("Enter elements");
    for(int i=0;i<5;i++)
	{
    	
    	numbers[i]=scanner.nextInt();
	}
	}
	
	public void small()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(numbers[i]>numbers[j])
				{
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println("Smallest value:"+numbers[0]);
	}
	
}
