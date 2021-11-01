package classpart;

public class Student { // 자바파일 이름과 퍼블릭 클래스 이름은 같아야함

	// 학생들이 가지는 속성이 멤버변수
	public int studentID; // private int studentID
	public String studentName;
	public String address;

	public Student(String name) { 
		studentName = name;
	}

	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";

	}

	// 기능은 메소드로 구현함
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}

	public String getStudent() {
		return studentName;
	}

}
