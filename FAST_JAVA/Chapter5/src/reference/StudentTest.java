package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.SetKoreaSubject("국어", 87);
		studentLee.SetMathSubject("수학", 96); 
		
		Student studentKim = new Student(100, "Kim");
		studentKim.SetKoreaSubject("국어", 100);
		studentKim.SetMathSubject("수학", 98); 
		
		studentLee.ShowStudentScore();
		studentKim.ShowStudentScore();

	}

}
