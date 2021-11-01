package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("");
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student("100, ������");
		//studentKim.studentName = "������";
		//studentKim.address = "����";
		
		
		studentKim.showStudentInfo();
		
		//System.out.println(studentKim);
		//System.out.println(studentLee);
		
		}

}




