package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Redquse {
 public static void main(String[] args) {
	List<String> list = Arrays.asList("hi","hello","print","goodbye");
	Optional<String> ans=list.stream().reduce((a,b)->a.length()>b.length()?a:b);
	System.out.println(ans.get());
}
}
