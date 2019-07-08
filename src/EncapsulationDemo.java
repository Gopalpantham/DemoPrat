class Student{
	private int rollNo;
	private String Name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollNo(1);
		s1.setName("gopal");;
		System.out.println(s1.getName());
System.out.println( s1.getRollNo());
	}

}
