/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

public class Student implements Person
{ 
	private String name; 
	private long Id; 
	private String position; 
	
	public Student(long Id, String name, String position) 
	{ 
		
		this.Id = Id; 
		this.name = name; 
		this.position = position; 
	} 
	
	@Override
	public void showPersonDetails() 
	{ 
		System.out.println(name+" Id number is: "+ Id+ " " + position ); 
	} 
} 
