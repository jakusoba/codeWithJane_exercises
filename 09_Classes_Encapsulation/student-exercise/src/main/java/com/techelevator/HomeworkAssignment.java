package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	
	public HomeworkAssignment(int possibleMarks, String submitterName) {
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;
	}
	
	public String getLetterGrade () {
		double grade = ((double) earnedMarks / (double) possibleMarks) * 100;

		if(grade >= 90) {
			return "A";
		}
		else {
			if(grade < 90 && grade >=80) {
				return "B";
			}
			else {
				if(grade < 80 && grade >= 70) {
					return "C";
				}
				else {
					if(grade < 70 && grade >= 60) {
						return "D";
					}
					else {
						return "F";
					}
				}
			}
		}
		
	}
	
	
	public int getearnedMarks() {
		return earnedMarks;
	}


	public void setearnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}


	public String getSubmitterName() {
		return submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

}
