/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

public class OrderXML implements XMLParser{ 
@Override
public void parse() { 
System.out.println("Parsing order XML..."); OrderXMLDisplayService.display();
return; 
} 
} 
