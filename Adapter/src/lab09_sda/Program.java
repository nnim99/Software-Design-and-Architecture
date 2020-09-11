/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09_sda;
public class Program {
      public static void main(String args[]) {
            String webHost = "Host:https:/google.com\n\r";
            Service service = new Service(webHost);
		   Adapter adapter = new Adapter(); 
		   adapter.connect(service);
            objClient client = new objClient(adapter);   
            
            client.doWork();
	} 
} 
