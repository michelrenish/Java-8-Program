package proj2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		/**String[] arr= new String[4];
		arr[0]="hello";
		arr[2]="bye";
		Supplier<String> s1=()->"-1";
		for(String ele:arr) {
			Optional<String> op=Optional.ofNullable(ele);
			System.out.println(op.orElse("dummy"));
		}
		
		System.out.println("=====================");
		for(String ele:arr) {
			Optional<String> op=Optional.ofNullable(ele);
			System.out.println(op.orElseGet(s1));
		} 
		
		List<Integer> l1=Arrays.asList(12,34,5,66,1,8);
		Optional<Integer> ans = l1.stream().reduce((a,b)->a>b?a:b);
		System.out.println(ans.get()); **/
		
List<String> l1=Arrays.asList("hi","virat","welcome","bye");
Optional<String> ans = l1.stream().reduce((a,b)->a.length()>b.length()?a:b);
Optional<String> ans1 = l1.stream().reduce((a,b)->a+" "+b);
System.out.println(ans.get());
System.out.println(ans1.get());

List<List<Integer>> l2=Arrays.asList(Arrays.asList(1,2,5),Arrays.asList(8,9,6),Arrays.asList(1,6,8,5));
List<Integer> ans3=l2.stream().flatMap(ele->ele.stream()).collect(Collectors.toList());
System.out.println(ans3);

	}
}



