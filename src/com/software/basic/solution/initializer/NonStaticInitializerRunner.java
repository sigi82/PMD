package com.software.basic.solution.initializer;

public class NonStaticInitializerRunner {

	public static void main(String[] args) {
		NonStaticInitializerExample example = new NonStaticInitializerExample();
		NonStaticInitializerExample example1 = new NonStaticInitializerExample("3");
		NonStaticInitializerExample example2 = new NonStaticInitializerExample(Integer.MAX_VALUE);
	}
}
