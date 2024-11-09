package java8features;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachMethodDemo {
	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Python", "Angular");
	   
		Consumer<String>consumer = (value) -> System.out.println(value);
		System.out.println("--------Passing Consumer object");
		courses.forEach(consumer);
		
		
		System.out.println("------Paaing Lambda Expression-------");
		courses.forEach((value) -> System.out.println(value));
		
		
		System.out.println("-------Passing Method References---------");
		courses.forEach(System.out :: println);
	
		
		List<Double> salaries = Arrays.asList(55000.0,45000.0,35000.0,65000.0);
		
		List<Double> filteredSalaries = new ArrayList <Double> ();
		
		/*
		salaries.forEach(salary-> {
			if(salary >= 40000) 
			{
			filteredSalaries.add(salary);
			}
			
		});
		*/
			
			
		
	
		
		
		System.out.println(filteredSalaries);
		
		for(Double salary : salaries) {
			if(salary>40000) {
				filteredSalaries.add(salary);
				
			}
		}
		System.out.println(filteredSalaries);
		
		

		Consumer<Double> consumers = (value) -> System.out.println(value);
		salaries.forEach(consumers);
		
		System.out.println("-------------");
		
		salaries.forEach((value) -> System.out.println(value));
		
		System.out.println("----------------");
		
		salaries.forEach(System.out :: println);
		
	}

}
