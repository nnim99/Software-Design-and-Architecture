/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

public class TestPrototypePattern { public static void main(String[] args) { XMLParserPrototype obj; 
obj = new ResponseXMLParser(); System.out.println(obj.parse()); 
XMLParserPrototype obj1 = obj.clone(); System.out.print(obj.parse()); 
} } 

