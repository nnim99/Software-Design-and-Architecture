/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

public class ResponseXMLParser implements XMLParserPrototype{ public String parse() {
System.out.println("Parsing response XML...");
return "Response XML Message"; 
}
@Override
public ResponseXMLParser clone(){ return new ResponseXMLParser(); }
} 
