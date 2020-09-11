/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.Hashtable;

/**
 *
 * @author nimoooooooo
 */
public class socialServices {
    private Hashtable<String,socialAccount> accounts;
    public socialServices(){
    this.accounts= new Hashtable<String,socialAccount>();
    }
    public String createNewAccount(String type){
    socialAccount newAccount = null;
        switch(type){
        case "admin":
            newAccount  = new Admin();
            break;
        case "user":
            newAccount = new User();
            break;
            
            
    }
     return null;
    }
    
    
    public String  deleteAccount(String type){
    switch(type){
        case "admin":
            System.out.println("Admin Account deleted.");
        case "user":
            System.out.println("User Account deleted.");
    
}
        return null;
    
    }

}