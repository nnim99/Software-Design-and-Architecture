/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;


public class User implements socialAccount {
public User(){
System.out.println("User account accessed");
}
    @Override
    public void addFriend(String name) {
        System.out.println("Friend added "+ name);
    }

    @Override
    public void sendRequest(String name) {
        System.out.println("Friend request sent "+ name);
    }

    

    @Override
    public void sendMessage() {
        System.out.println("Message sent.");
    }
    
}