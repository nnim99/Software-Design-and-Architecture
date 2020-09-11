/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

public class WildPizza implements PizzaMake{

public String make(){
System.out.println("Making Buffalo Wild Pizza..");
return"Pizza Wild";
}
}
