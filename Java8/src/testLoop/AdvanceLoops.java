package testLoop;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class AdvanceLoops {
	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(40, 10, 50, 59, 90);
		List<String> l2 = Arrays.asList("Michel", "Renis", "Clinton", "SKIP");
//		for (Integer ele : l1) {
//			System.out.println(ele);
//		}
		//forEach Method have in-build Consumer Interface
		l1.forEach((ele)->System.out.println(ele));
		l2.forEach((ele)->System.out.println(ele));
		
		Consumer<Integer> c1 =(n)->System.out.println(n+10); 
		l1.forEach(c1);
		Consumer<String> c2 =(s)->System.out.println(s.toUpperCase());
		l2.forEach(c2);
		Consumer<String> c3=(ele)->System.out.println(ele.length());
		l2.forEach(c3.andThen(c2));
	}
}
