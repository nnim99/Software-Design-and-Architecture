/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

public class TestFactoryMethodPattern { 
public static void main(String[] args) { XMLParser service = new FeedbackXML(); service.parse(); 
XMLParser service1 = new ErrorXML(); service1.parse(); 
XMLParser service2 = new OrderXML(); 

service2.parse(); 
XMLParser service3 = new ResponseXML(); service3.parse(); 
} } 
