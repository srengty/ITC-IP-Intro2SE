package lab05.tasks;

/**
 * Describe about a Subject in IP class. 
 * @author Sreng
 * @version 1.0
 * @modified 10/01/2025
 */
public class Subject {
	private String subjectName; //e.g. Introduction to SE
	private int subjectCode; //e.g. 1
	private int numberOfCredits = 1;
	public Subject() {
		super();
	}
	public Subject(String subjectName, int subjectCode, int numberOfCredits) {
		super();
		this.subjectName = subjectName;
		this.subjectCode = subjectCode;
		this.numberOfCredits = numberOfCredits;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	
}
