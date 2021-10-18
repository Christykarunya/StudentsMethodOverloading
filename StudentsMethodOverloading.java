package week3.day2;

public class StudentsMethodOverloading {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID: " +id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student Email: "+email);
		System.out.println("Student Phone Number: "+ phoneNumber);
		
	}

	public static void main(String[] args) {
		StudentsMethodOverloading stu1=new StudentsMethodOverloading();
		stu1.getStudentInfo(101);
		stu1.getStudentInfo(102, "Christy");
		stu1.getStudentInfo("chris@gmail.com", 9192939495l);

	}

}
