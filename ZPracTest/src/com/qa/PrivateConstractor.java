package com.qa;

class MyConstractor {
	private static MyConstractor obj= new MyConstractor();
	
	private MyConstractor() {
		System.out.println("This is calling the Private Constractor");
	}
	
	public static MyConstractor getData() {
		return obj;
	}
	
}

public class PrivateConstractor {

	public static void main(String[] args) {
		
		MyConstractor pc= MyConstractor.getData();
		
		
		

	}

}
