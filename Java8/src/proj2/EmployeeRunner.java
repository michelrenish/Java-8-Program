package proj2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee e1=new Employee(123,"virat",45623,23);
		Employee e2=new Employee(465,"rahul",55623,25);
		Employee e3=new Employee(412,"ramesh",23584,26);
		Employee e4=new Employee(236,"suresh",35623,27);
		Employee e5=new Employee(452,"pandya",65623,23);
		Employee e6=new Employee(741,"gopal",78623,24);
		Employee e7=new Employee(413,"govind",42368,26);
		List<Employee> l1=Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
		
//converting ename int upper case and returning as list
		List<Employee> l2=l1.stream().map((obj)->{
			obj.setEname(obj.getEname().toUpperCase());
			return obj;
		}).collect(Collectors.toList());
		
		l2.forEach(ele->System.out.println(ele));
		
//ename as upper case and increase sal by 10000 .Return map of eid and sal
	Map<Integer,Double> m1=l1.stream().map((obj)->{
			obj.setEname(obj.getEname().toUpperCase());
			obj.setSal(obj.getSal()+10000);
			return obj;
		}).collect(Collectors.toMap(obj->obj.getEid(),obj->obj.getSal()));
		System.out.println(m1);
		System.out.println("==========================================");
//print only employee who has age >25
l1.stream().filter((e)->e.getAge()>25).forEach((ele)->System.out.println(ele));		
System.out.println("===================================================");
//filter only employees who's age greater than 24 and increase their sal by 5000
//then store their data as list
Predicate<Employee> p1=(e)->e.getAge()>24;

List<Employee> l3=l1.stream().filter(p1).map((e)->{
	e.setSal(e.getSal()+5000);
	return e;}).collect(Collectors.toList());

l3.forEach(ele->System.out.println(ele));
		
	}
}











