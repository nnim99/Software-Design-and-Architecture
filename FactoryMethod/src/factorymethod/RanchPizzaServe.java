/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

public class RanchPizzaServe extends ServePizza{
@Override
public PizzaMake getPizza() {
return new RanchPizza();
}
}