package classpart;

public class Student {

		// 멤버변수
		public int studentID; //private int studentID
		public String studentName;
		public String address;
		
		public Student(String name) {
			studentName = name;
		}
		
		public Student(int id, String name) {
			studentID = id;
			studentName = name;
			address = "주소 없음";
			
			
		}
		//메소드
		public void showStudentInfo() {
			
			System.out.println(studentName + ", " + address);
		}
		
		public String getStudent() {
			return studentName;
		}

}
