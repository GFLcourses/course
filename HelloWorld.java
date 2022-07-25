package com.chornovil.consoleProject;

public class HelloWorld{
	public static void main(String[] args){
		new HelloWorld().run();
	}

	private void run(){
		Person person = new Person("Ann");
		System.out.println("Hello, " + person.getName());
	}	
} 
