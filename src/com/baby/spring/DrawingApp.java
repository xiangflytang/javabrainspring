package com.baby.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
	public static void main(String[]args){
		ApplicationContext context=
				new ClassPathXmlApplicationContext("Beans.xml");
		Triangle t=(Triangle)context.getBean("Triangle");
		t.draw();
	}
}	
