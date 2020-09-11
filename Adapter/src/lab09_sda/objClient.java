/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09_sda;

public class objClient {
      private objRequester requester;
   
	public objClient(objRequester requester) {
		 this.requester = requester; 
                 System.out.println("In objRequester Constructor");
	} 
      private Object makeObject() {
          Object Obj= new Object() ;
          return Obj;
      };
      

public void doWork() {
	Object object = makeObject();
	int status = requester.request(object); 
      if (status == 200) {
          System.out.print("Status: ");
            System.out.println("OK");
      } else {
          System.out.print("Status: ");
            System.out.println("Not OK");
} 
return; 
} 
};
