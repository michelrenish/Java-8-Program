package BasicFunInterFace;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PridicateRun{
	public static void main(String[] args) {
		//in predicate interface only accept gentric type only.

		Predicate<Double> p = (x) -> x>2;
		
		System.out.println(p.test(89.87));
//		System.out.println(p.test("hii"));s
//		Predicate <Integer> p =
		BiPredicate<Double,Long> p1=(x,y)-> x>y;
		p1.test(7.8, 34l);
	}
}
