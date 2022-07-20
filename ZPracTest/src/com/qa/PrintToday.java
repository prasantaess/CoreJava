package com.qa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintToday {

	public static void main(String[] args) {
		
		Date date= new Date();
		SimpleDateFormat SF= new SimpleDateFormat("dd/MM/YYYY");
		String current_date= SF.format(date);
		System.out.println(current_date);

	}

}
