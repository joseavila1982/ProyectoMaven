/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webja.util;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author JOSE
 */
public class Utilidades {
    public static Object getEjbRemote(String nameEJB, String iface) throws Exception{
        Context context;
        Properties prope = new Properties();
        prope.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
        prope.put(Context.PROVIDER_URL, "http://localhost:7001");
        try{
            context = new InitialContext(prope);
            String lookup = nameEJB+"&"+iface;
            System.out.println("Lookup: "+ lookup);
            return context.lookup(lookup);
        }catch(Exception ex){
            throw new Exception("No se encontro el EJB: '"+nameEJB+"'.");
        }   
    }    
}
