package staticex;

public class StudentIDTest {
	
	public static void main(String[] args) {
		//Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum()); //static변수는 인스턴스의 생성과는 상관없이 사용한다.
		
		/*Student studentKim = new Student("kim");
		
		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		*/
		
	}

}
