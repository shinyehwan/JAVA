package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("김유신"); // 기본생성자
		//studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(200, "이순신");
		//studentKim.studentName = "김유신";
		//studentKim.address = "경주";
		
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim); // JVM이 준 가상의 힙주소값
		System.out.println(studentLee);
		
		}

}




