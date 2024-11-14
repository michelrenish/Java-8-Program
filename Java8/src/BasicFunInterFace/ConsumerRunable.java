package BasicFunInterFace;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerRunable {
	public static void main(String[] args) {
		Consumer<Integer> c1 = (n) -> System.out.println(n + "bye");
		c1.accept(100);// it will concat
		c1.accept(809);
		Consumer<Integer> c2 = (n) -> System.out.println(n + 100);
		c2.accept(100);// it will add
		// there is BiConsumer it have 2 args
		BiConsumer<Boolean, String> b1 = (x, y) -> System.out.println(x + y);
		b1.accept(true, " Michel");
		BiConsumer<Integer, String> b2 = (x, y) -> System.out.println(x + y);
		b2.accept(420, " Michel");
		BiConsumer<Integer, Integer> b3 = (x, y) -> System.out.println(x + y);
		b3.accept(420,567);
	}
}
