/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

public class FeedbackXML implements XMLParserPrototype{ @Override
public String parse() {
System.out.println("Parsing feedback XML..."); 
return "Feedback XML Message"; }
@Override
public FeedbackXML clone(){ return new FeedbackXML(); 
} } 
