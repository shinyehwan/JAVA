package staticex;

public class StudentIDTest {
	
	public static void main(String[] args) {
		//Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum()); //static변수 인스턴스의 생성여부와 상관없다.
		
		/*Student studentKim = new Student("kim");
		
		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentKim.getStudentID());
		*/
		
	}

}
