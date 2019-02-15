package BasicProgram;

import java.util.Scanner;

public class Biggest {
	int numbers[]=new int[5];
	int bigvalue;
	Scanner scanner= new Scanner(System.in);
	
public void getValue()
	{
	System.out.println("Enter all the elements:");
	for(int i=0;i<5;i++)
	{
	numbers[i]=scanner.nextInt();
	}
}
public void big()
{
	for(int i=0;i<5;i++)
	{
		for(int j=i+1;j<5;j++)
		{
			if(numbers[i]<numbers[j])
			{
				int temp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
				
			}
		}
	}
	System.out.println("Biggest value="+numbers[0]);
}
}
