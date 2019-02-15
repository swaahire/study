package com.swati.Date;

public class MytestRecord {
	MyDate startDate;
	MyDate endDate; 
	int actauldifference;
	public MytestRecord(MyDate startDate, MyDate endDate, int actauldifference) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.actauldifference = actauldifference;
	}
	public MyDate getStartDate() {
		return startDate;
	}
	public void setStartDate(MyDate startDate) {
		this.startDate = startDate;
	}
	public MyDate getEndDate() {
		return endDate;
	}
	public void setEndDate(MyDate endDate) {
		this.endDate = endDate;
	}
	public int getActauldifference() {
		return actauldifference;
	}
	public void setActauldifference(int actauldifference) {
		this.actauldifference = actauldifference;
	}
	
	
	}
	

