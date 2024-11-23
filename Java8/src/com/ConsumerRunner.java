package com;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerRunner {

	public static void main(String[] args) {
		Consumer c1=(n)->{System.out.println("helllo :"+n);};
		c1.accept("Rahul");
		
		Consumer c2=(n)->{System.out.println("bye :"+n);};
		c2.accept(100);
		
		Consumer<String> c3=(n)->{System.out.println("bye :"+n);};
		c3.accept("Byyeee");
		
		BiConsumer c4=(n1,n2)->{System.out.println("Sum:"+n1+n2);};
		c4.accept(55, "bye");
		
		BiConsumer<Integer,Integer>c5=(n1,n2)->{System.out.println("Sum:"+(n1+n2));};
		c5.accept(55, 4);
		}
		
	}

