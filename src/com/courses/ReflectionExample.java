package com.courses;
import java.lang.reflect.Method;
import java.lang.reflect.Field;


public class ReflectionExample {
	public void list() {
		Class arrayList = MyIntArrayList.class;
		
		Method[] methods = arrayList.getMethods();
		for(Method elem:methods) {
			System.out.println(elem.getName());
		}
		System.out.println();
		
		Field[] fields = arrayList.getDeclaredFields();
		for(Field elem:fields) {
			System.out.println(elem.getName());
		}
	}
	
	public static void main(String[] args) {
		new ReflectionExample().list();

	}

}
