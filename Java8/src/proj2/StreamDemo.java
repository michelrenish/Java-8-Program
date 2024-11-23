package proj2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> l1=Arrays.asList(12,3,4,56,78,89);
		List<Integer> l2=l1.stream().map((n)->n+3).collect(Collectors.toList());
		System.out.println(l2);
		
		
		List<Integer> l3=Arrays.asList(12,5,6,12,47,8,5);
		Set<Integer> s1=l3.stream().map((n)->n+10).collect(Collectors.toSet());
		System.out.println(s1);
		
List<String> l4=Arrays.asList("Virat","Abd","Rcb","Csk","Dhoni","Gill");
		Map<Character,String>m1=l4.stream().map(s->s.toLowerCase()).
		collect(Collectors.toMap((s)->s.charAt(0),s->s));
		System.out.println(m1);
		
	}
}
