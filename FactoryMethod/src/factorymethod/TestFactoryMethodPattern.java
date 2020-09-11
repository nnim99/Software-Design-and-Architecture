/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

public class TestFactoryMethodPattern {

	public static void main(String[] args) {
		ServePizza service = new RanchPizzaServe();
		service.serve();
		
		service = new TikkaPizzaServe();
		service.serve();
		
		service = new PepperoniPizzaServe();
		service.serve();
		
		service = new WildPizzaServe();
		service.serve();

	}

}
