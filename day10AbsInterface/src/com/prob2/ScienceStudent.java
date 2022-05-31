package com.prob2;

public class ScienceStudent extends Student{
	


	int phyicsMarks;
	int chemistryMarks;
	int mathMarks;
	
	

	public int getPhyicsMarks() {
		return phyicsMarks;
	}

	public void setPhyicsMarks(int phyicsMarks) {
		this.phyicsMarks = phyicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	
	public ScienceStudent(String name, String address) {
		super(name, address);
		
	}

	@Override
	public double getPercentage() {

		
//		  (marks)300 * 100/ 500(totalSub)
		
		double percentages = (getPhyicsMarks() + getChemistryMarks() + getMathMarks()) * 100/300;
		return percentages;
	}
	
	

}
