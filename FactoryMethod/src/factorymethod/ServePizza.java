/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

public abstract class ServePizza {
public void serve(){
PizzaMake pizza = getPizza();
String msg = pizza.make();
System.out.println(msg);
}
protected abstract PizzaMake getPizza();
    
}
