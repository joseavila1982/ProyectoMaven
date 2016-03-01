/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.ejb;

import com.maven.dominio.Login;
import com.maven.negocio.NegocioLogin;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author JOSE
 */
@Stateless(mappedName = "ejbLogin22")
public class SessionLogin implements NegocioLogin {
    @PersistenceContext(unitName="PersistenceJA")
    EntityManager em;
    
    @Override
    public Login validarLogin(Login obj) throws Exception {
        try{
            Query query = em.createNamedQuery("Login.findByUsuarioAndPassword");
            query.setParameter("usuario", obj.getUsuario());
            query.setParameter("password", obj.getPassword());
            List lista = query.getResultList();
            if(lista.size() > 0){
                obj.setStatus(true);
                obj.setMensaje("Usuario Encontrado..");
            }else{
                obj.setStatus(false);
                obj.setMensaje("El Usuario no fue encontrado..");
            }
            System.out.println("User:"+ obj.getUsuario());
            System.out.println("Password:"+ obj.getPassword());
            return obj;                    
        }catch (Exception ex){
            throw new Exception("Error en ValidarUsuario: "+ ex.getMessage(), ex);
        }
    }
    
}
