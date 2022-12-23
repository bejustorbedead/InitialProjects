package students;

public class Grade {
	public String student;
	public double grade1,grade2,grade3;
	
	public double eqGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public String finalGrade() {
		return "Final Grade: "+eqGrade();
	}
	
	public String pass() {
		
		if (eqGrade() >= 60) {
			return "PASS";
		} else {
			return "FAILED, MISSING: " + (60 - eqGrade()) + " POINTS.";
		}
	}
	
	
}
