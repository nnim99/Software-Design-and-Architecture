/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author nimoooooooo
 */
public class Test {
    
    public static void main(String[] args){
    socialServices sc = new socialServices();
    String admin = sc.createNewAccount("admin");
    String user = sc.createNewAccount("user");
    String admin1 = sc.deleteAccount("admin");
    String user1 = sc.deleteAccount("user");
    }
    
}
