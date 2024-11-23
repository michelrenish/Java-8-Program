package ComparatorV8;

import java.util.List;
import java.util.stream.Collectors;

public class FateMap {
	public static void main(String[] args) {
		List<Employee> l1 = EmployeeService.getAll();
		
		// List all the skils of employee whos age is grater tha 25;
		System.out.println("===============================");
		// filtering age>25
		List<String> skils = l1.stream().filter(ele -> ele.getAge() > 25)
				// getting Skills of age>25 convert to stream removing duplicate or use toSet();
				.map(ele -> ele.getSkills()).flatMap(ele -> ele.stream()).distinct().collect(Collectors.toList());
		System.out.println(skils);
		System.out.println("===============================");
		// print the employee of employees lesser than 30
		List<Employee> num =l1.stream().filter(ele->ele.getAge()<30).map(ele->ele).collect(Collectors.toList());
		num.forEach(ele->System.out.println(ele));
		System.out.println("===============================");
		// print the number of employees lesser than 30
		long num1 =l1.stream().filter(ele->ele.getAge()<30).count();
		System.out.println(num1);
	}
}
