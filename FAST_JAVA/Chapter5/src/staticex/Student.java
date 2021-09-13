package staticex;

public class Student {

		// 멤버변수
		private static int serialNum = 1000;
		private int studentID; //private int studentID
		public String studentName;
		public String address;
		
		public Student(String name) {
			studentName = name;
			serialNum++;
			studentID = serialNum;
		}
		
		public Student(int id, String name) {
			studentID = id;
			studentName = name;
			address = "주소 없음";
			serialNum++;
			studentID = serialNum;

			
		}
		//메소드
		public void showStudentInfo() {
			
			System.out.println(studentName + ", " + address);
		}
		
		public String getStudent() {
			return studentName;
		}

		public int getStudentID() {
			serialNum++;
			return studentID;
		}

		public static int getSerialNum() {
			int i = 0;
		 //	studentName = "Lee"; 스테틱변수에서는 인스턴스 변수를 사용할 수 없음.
			return serialNum;
			
		}

		public static void setSerialNum(int serialNum) {
			Student.serialNum = serialNum;
		}
		
		
}
