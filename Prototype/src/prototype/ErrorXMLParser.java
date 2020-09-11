/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

public class ErrorXMLParser implements 					
  XMLParserPrototype{ public String parse() { 
System.out.println("Parsing error XML...");
return "Error XML Message"; }
@Override 
public ErrorXMLParser clone(){ return new ErrorXMLParser(); }
} 
