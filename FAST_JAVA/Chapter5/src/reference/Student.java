package reference;

public class Student {

	int studentID;
	String studentName;
	
	/*
	int koreaScore;
	int mathScore;
	int engScore;
	
	String koreaName;
	String mathName;
	String engName;
	 */
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void SetKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
			
	}
	
	public void SetMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	
	public void ShowStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
	}
	
}
