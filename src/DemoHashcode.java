import java.util.HashMap;
import java.util.Map;


public class DemoHashcode {

	public static void main(String[] args) {
		Employee e1=new  Employee(1);
		Employee e2=new Employee(1);

		Map<Employee, String> m1=new HashMap<Employee, String>();
		m1.put(e1,"gopal");
		m1.put(e2,"gopal");
		System.out.println(m1.size());

		Integer i=new Integer(1);
		Integer i1=new Integer(1);
		Map<Integer, String> m2=new HashMap<Integer, String>();
		m2.put(i, "one");
		m2.put(i1, "one");
		System.out.println(m2.size());
	}
}

class Employee{
	int Id;

	public Employee(int id) {
		super();
		Id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Id != other.Id)
			return false;
		return true;
	}


}
