package com.swati.Date;

public class TestSupport {
	public static void main(String[] args) {
		DateDifferenceProvider provider=new DateDifferenceProvider();
		MytestRecord[] testrecord=new MytestRecord[2];
		testrecord[0]=new MytestRecord(new MyDate(4,6,2011),new MyDate(4,6,2011),0);
		testrecord[1]=new MytestRecord(new MyDate(6,4,2011),new MyDate(18,4,2011),12);
		
	
/*	for(int index=0;index<testrecord.length;index++){
		int calculateDiff=provider.getDateDifference(testrecord[index].getStartDate(),testrecord[index].getEndDate());
		if(calculateDiff==testrecord[index].getActauldifference())
		{
			System.out.println("Test case passed");
		}
		else{
			System.out.printf("Test case failed"+"actual="+testrecord[index].getActauldifference()+"calculate="+calculateDiff);
			}
		}
	}*/	
	}
}
