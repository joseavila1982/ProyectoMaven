/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webja.bean;

import com.maven.dominio.Login;
import com.webja.servicios.ServicioLogin;
import java.io.Serializable;

/**
 *
 * @author JOSE
 */
public class BeanLogin implements Serializable{
    private Login usuario;
    private ServicioLogin servicioLogin;
    
    
    public String validarLogin() {
        System.out.println("User : " + getUsuario().getUsuario());
        System.out.println("Password : " + getUsuario().getPassword());
        try {
            usuario = getServicioLogin().validarLogin(usuario);
            if (usuario.isStatus()) {
                return "/content/welcome";
            } else {
                return "login";
            }
        } catch (Exception ex) {
             System.out.println("EXCEPCION: "+ ex.getMessage());
            return "login";
        }
    }

      
    /**
     * @return the usuario
     */
    public Login getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Login usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the servicioLogin
     */
    public ServicioLogin getServicioLogin() {
        return servicioLogin;
    }

    /**
     * @param servicioLogin the servicioLogin to set
     */
    public void setServicioLogin(ServicioLogin servicioLogin) {
        this.servicioLogin = servicioLogin;
    }

    
    
}
