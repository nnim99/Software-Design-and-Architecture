/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09_sda;

public class Adapter implements objRequester { 
	private Service service; 
	public void connect(Service currentService){
		 this.service = currentService;
		/* Connect to the web service */ 
               System.out.println("Connection Establed..");
	}
        @Override
	public int request(Object request) {
		newObj result = this.tonewObj(request);
		newObj response = service.request(result); 
		if (response != null)
			return 200; // OK status code
		return 500; // Server error status code
      }
      private newObj tonewObj(Object input){ 
      
        System.out.println("Object is converted into newObj.");  
        newObj obj1 = new newObj(input);
         return obj1;
     
      };

}
