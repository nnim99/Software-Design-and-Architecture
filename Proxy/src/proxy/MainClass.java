/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

public class MainClass {
	
   public static void main(String[] args) {
      GameGraphics image = new ProxyGraphics("testingGameGraphics");

      
      image.display(); 
      System.out.println("");
      
     
      image.display(); 	
   }
}

