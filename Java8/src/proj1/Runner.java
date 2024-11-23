package proj1;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		List<Employee> l1=EmployeeService.getAll();
		
		//list all the skill set of employees
		
List<String> ans = l1.stream().map(ele->ele.getSkills()).
					flatMap(ele->ele.stream()).distinct().collect(Collectors.toList());
System.out.println(ans);
	//list all the skills of employees who's age is greater than 25
Set<String> ans1 = l1.stream().filter(ele->ele.getAge()>25).map(ele->ele.getSkills()).
		flatMap(ele->ele.stream()).collect(Collectors.toSet());
System.out.println(ans1);

	//print the number of employees who's age is lesser than 30
long n = l1.stream().filter(ele->ele.getAge()<3).count();
System.out.println(n);

//match anymatch matchall
boolean b1=l1.stream().map(ele->ele.getEname()).anyMatch(s-> s.charAt(0)=='a');
System.out.println(b1);

boolean b2=l1.stream().map(ele->ele.getEname()).allMatch(s-> s.charAt(0)=='a');
System.out.println(b2);

boolean b3=l1.stream().map(ele->ele.getEname()).allMatch(s-> s.charAt(s.length()-1)=='f');
System.out.println(b3);
	}
}







