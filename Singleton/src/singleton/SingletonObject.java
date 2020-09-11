/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

public class SingletonObject {
private static SingletonObject obj = null;
private SingletonObject(){}
public static SingletonObject getInstance(){
if(obj==null){
obj = new SingletonObject();
System.out.println("Object Created");
}
System.out.println("Object passed");
return obj;

}
}