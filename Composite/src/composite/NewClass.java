/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author nimoooooooo
 */
public class NewClass {
    
	public static void main (String[] args) 
	{ 
		Student student1 = new Student(12, "Abeer Fatima", "2nd Year Student"); 
		Student student2 = new Student(13, "Ali Raza", "3rd year Student"); 
		School schDir = new School(); 
		schDir.addPerson(student1); 
		schDir.addPerson(student2); 
		
		Teacher teacher1 = new Teacher(1, "Ahmad Ali", "Web Teacher"); 
		Teacher teacher2 = new Teacher(2, "Sara Fatima ", "English Teacher"); 
		
		School techDir = new School(); 
		techDir.addPerson(teacher1); 
		techDir.addPerson(teacher2); 
	
		School directory = new School(); 
		directory.addPerson(schDir); 
		directory.addPerson(techDir); 
		directory.showPersonDetails(); 
	} 
}

