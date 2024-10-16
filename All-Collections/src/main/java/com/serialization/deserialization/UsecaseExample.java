package com.serialization.deserialization;

public class UsecaseExample {

	Person pers=new Person("Alice",5);

	public  void method1() {
		if(pers.getAge()>18) {
			System.out.println("he is major");
		}else {
			System.out.println("he is minor");
		}
	}
}
