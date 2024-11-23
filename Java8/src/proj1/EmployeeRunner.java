package proj1;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeRunner {
	
	
	public static void main(String[] args) {
	
		List<Employee> l1=EmployeeService.getAll();
		
		Comparator<Employee> c1=(obj1,obj2)->obj1.getAge()-obj2.getAge();	
		Collections.sort(l1,c1);
		
		l1.forEach((ele)->System.out.println(ele));
		
		
		
		
		
		
	/***	
		l1.forEach((ele)->System.out.println(ele));
		
		System.out.println("=================================");
		
	//only name
		Consumer<Employee> c1=(e)->{System.out.println(e.getEname());};
		
	//only age
		Consumer<Employee> c2=(e)->{System.out.println(e.getAge());};
		
	//only desgn
		Consumer<Employee> c3=(e)->{System.out.println(e.getDsgn());};
		
	//all 
		Consumer<Employee> c4=(e)->{System.out.println(e);};	
		System.out.println("==================================");
		l1.forEach(c1);
		System.out.println("==================================");
		l1.forEach(c3);
		System.out.println("==================================");
		l1.forEach(c1.andThen(c3).andThen(c2));
		
		System.out.println("================================================");
		
		Predicate<Employee> p1=(e)->e.getAge()>26;
		
		l1.forEach( (ele)->{ 
			   if(p1.test(ele)) {
				   c4.accept(ele);
			   }
		});
Predicate<Employee> p2=(obj)->obj.getAge()>=24;
Predicate<Employee> p3=(obj)->obj.getSal()>=50000;
		
Function<List<Employee>,Map<Integer,String>> f1=
		(l)->{
			Map<Integer,String> m1=new LinkedHashMap<Integer, String>();
			l.forEach((obj)->{
				if(p2.and(p3).test(obj)) {
					m1.put(obj.getEid(),obj.getEname());
				}
			});
			return m1;
		};
		
System.out.println(f1.apply(l1));
		**/
		
		
		
	}

}





