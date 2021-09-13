package reference;

public class Student {

	int studentID;
	String studentName;
	
	/*int koreaScore;
	int mathScore;
	int engScore;
	
	String koreaName;
	String mathName;
	String engName;
	  이게 뭐야 학생의 클래스야 과목의 클래스야? */
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		//생성자에서 참조자료형타입의 변수를 초기화한다. 코리아, 메스의 변수가 생성이 되었다.
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
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
