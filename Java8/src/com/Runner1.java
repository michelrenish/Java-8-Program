package com;

public class Runner1 {

	
	public static void main(String[] args) {
	FunDemo1 f1=()->{ System.out.println("hello hi");};
		f1.display();
		
	FunDemo1 f2=()->{System.out.println("bye...!!!!");};
		f2.display();
	
	FunDemo2 f3=(x,y)->{System.out.println("Sum:"+(x+y));};
		f3.show(52, 7);
		
	FunDemo3 f4 =()->"hello"+67;
	System.out.println(f4.displayy());
		}
	}

	

