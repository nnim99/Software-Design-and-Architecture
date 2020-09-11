/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

public class School implements Person
{ 
	private List<Person> List = new ArrayList<Person>(); 
		
	public void showPersonDetails() 
	{ 
		for(Person per:List) 
		{ 
			per.showPersonDetails(); 
		} 
	} 
		
	public void addPerson(Person per) 
	{ 
		List.add(per); 
	} 
		
	public void removePerson(Person per) 
	{ 
		List.remove(per); 
	} 
} 
