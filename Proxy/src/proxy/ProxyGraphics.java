/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

public class ProxyGraphics implements GameGraphics{

   private RealGraphics realGraphics;
   private String game;

   public ProxyGraphics(String game){
      this.game = game;
   }

   @Override
   public void display() {
      if(realGraphics == null){
         realGraphics = new RealGraphics(game);
      }
      realGraphics.display();
      System.out.println("Displaying from proxy ");
   }
}
