package com.csi.basics;

public class JavaEnumConcept {

	public enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, 
		OCTOBER, NOVEMBER, DECEMBER
	}

	public static void main(String[] args) {
		for (Months m : Months.values()) {
			//System.out.println(m);
			if(m.toString().equals("NOVEMBER"))
			{
				System.out.println("DIWALI MONTH");
			}
		}
	}
}
