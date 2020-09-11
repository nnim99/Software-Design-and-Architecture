/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

public class OrderXMLParser implements XMLParserPrototype{ @Override
public String parse() {
System.out.println("Parsing order XML..."); 
return "Order XML Message";
}
@Override
public OrderXMLParser clone(){ return new OrderXMLParser(); } 
} 
