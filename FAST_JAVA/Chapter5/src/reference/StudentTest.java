package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.SetKoreaSubject("����", 87);
		studentLee.SetMathSubject("����", 96); 
		
		Student studentKim = new Student(100, "Kim");
		studentKim.SetKoreaSubject("����", 100);
		studentKim.SetMathSubject("����", 98); 
		
		studentLee.ShowStudentScore();
		studentKim.ShowStudentScore();

	}

}
