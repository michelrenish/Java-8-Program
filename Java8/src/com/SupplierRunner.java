package com;

import java.util.function.Supplier;

public class SupplierRunner {
	
	public static void main(String[] args) {
		
		Supplier s1=()->Math.random();
		System.out.println(s1.get());
		System.out.println(s1.get());
		
		Supplier s2=()->"Hello hi";
		System.out.println(s2.get());
		
		Supplier<Integer> s3=()->10;
		System.out.println(s3.get());
		
		
	}

}
