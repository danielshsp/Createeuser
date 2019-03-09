/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createeuser;

import java.util.*;
import javax.naming.*;
import javax.naming.directory.*;
import javax.naming.InitialContext;
import javax.naming.Context;


public class Ldap {
    String username = "";
    String password = "";
    public Ldap(String username,String password){
        
        this.username=username;
        this.password=password;
    }
    
    public boolean checkLogin(){
        
          boolean session = false;
          Hashtable env = new Hashtable(11);
          env.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
          env.put(Context.PROVIDER_URL, "ldap://10.97.2.32:389");
          env.put(Context.SECURITY_AUTHENTICATION, "simple");
          env.put(Context.SECURITY_PRINCIPAL, ""+username+"" );
          env.put(Context.SECURITY_CREDENTIALS, ""+password+""); 
            try{
                    DirContext ctx = new InitialDirContext(env);
                      System.out.println("connected to AD");
                      session = true;
                     ctx.close();
            }catch(NamingException e){
                System.out.println("failed couldn't connected to AD");
                 e.getExplanation();
                 session = false;
                
            }
        return session;
    }
    
    
}
