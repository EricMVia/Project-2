import java.util.*;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*; 
// The abstract class contains two instance variabes 
	public abstract class Employee implements Serializable {
		private String name; 
		private double wage; 
	// The method of an abstract class is protected and it contains the Employee's name and wage 
	protected Employee(String name, double wage) {
		this.name = name; 
		this.wage = wage;  
} 
// The method returns the Employee's name 
	public String getName() {
		return name; } 
// The method returns the Employee's wage 
	public double getWage() {
		return wage; 
	} 
// The method sets the the Wage 
	@Test
	public void setWage(double wage){
		this.wage = wage;
		String balls1 = "hello";
		assertNotNull(balls1);
 }
// The method sets Name 
	public void setName(String name) {
		this.name = name; 
} 
// The abstract method returns a double and takes in the amount of hours the employee works. 
	public abstract double computePay(int hours); 
	// The  method raises the Employee's wage by the given amount percent that is specified. 
	@Test
	public void raise(double percent) {
	
	wage = wage * (1+(percent/100)); 
	String balls = "hello";
	assertNotNull(balls);

} 

} 