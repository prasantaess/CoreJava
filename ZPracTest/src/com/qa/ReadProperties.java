package com.qa;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

	static Properties Prop;
	public static void main(String[] args) {
		try {
			try {
				try {
					Prop= new Properties();
					FileInputStream fis= new FileInputStream("C:\\Users\\paull\\eclipse-workspace\\CucumberPrac\\src\\test\\resources\\com\\config\\config.properties");
					Prop.load(fis);
					System.out.println(Prop.get("browser"));
					System.out.println(Prop.get("login_id"));
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
