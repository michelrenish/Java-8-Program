package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SteamsApi {
	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(10,13,56,78,54,10);
		
		List<Integer>l1 = ls.stream().map((m)->m+4).collect(Collectors.toList());
		System.out.println(l1);
		int a =10;

			 List<Integer> result =ls.stream().map((m)->m+a)
			.collect(Collectors.toList());
			 System.out.println(result);
			 
			 Set<Integer> s1 = ls.stream().map((m)->a+m).collect(Collectors.toSet());
			 System.out.println(s1);
			 
			 List<String> l5 = Arrays.asList("Abc","Kutty","Dog","Cat","zebra");
			 
			 Map<Character,String> m1 = l5.stream()
					 .map(m->m.toUpperCase()).collect(Collectors.toMap((m)->m.charAt(0),m->m));
			 System.out.println(m1);
	}

}
