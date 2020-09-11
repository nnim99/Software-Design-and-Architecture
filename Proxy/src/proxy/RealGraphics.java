/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

public class RealGraphics implements GameGraphics {

   private String game;

   public RealGraphics(String game){
      this.game = game;
      loadFromGraphicCard(game);
   }

   public void display() {
      System.out.println("Displaying the Graphics: " + game);
   }

   private void loadFromGraphicCard (String game){
      System.out.println("Loading from Graphics Card " + game);
   }
}
