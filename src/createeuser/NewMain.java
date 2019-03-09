/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createeuser;


public class NewMain {


    public static void main(String[] args) {
          //CreateUser cs = new CreateUser(1);
	  //System.out.println(cs.users());  
          Ldap ld = new Ldap("daniel@siren.local","Motorola1");
          boolean ldapck = ld.checkLogin();
          System.out.println(ldapck);
    }
        
    
} 
