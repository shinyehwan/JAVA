package staticex;

public class Student {

		// �������
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
		//�޼ҵ�
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
		 //	studentName = "Lee"; //static 변수안에서 인스턴스 메소드는 쓸 수 없다. new 메소드를 생성해야해
			return serialNum;
			
		}

		public static void setSerialNum(int serialNum) {
			Student.serialNum = serialNum;
		}
		
		
}
