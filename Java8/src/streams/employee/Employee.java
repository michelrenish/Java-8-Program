package streams.employee;

public class Employee {
	
	private int eid;
	private String ename;
	private double sal;
	private int age;
	public Employee(int eid, String ename, double sal, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", age=" + age + "]";
	}
	
	
}
