/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webja.servicios;

import com.maven.dominio.Login;
import com.maven.negocio.NegocioLogin;
import com.webja.util.Utilidades;

/**
 *
 * @author JOSE
 */
public class ServicioLogin implements IFaceLogin {
    NegocioLogin ejb;
    
    @Override
    public Login validarLogin(Login obj) throws Exception {
        ejb = (NegocioLogin) Utilidades.getEjbRemote("ejbLogin22", NegocioLogin.class.getName());
        return ejb.validarLogin(obj);
    }
    
}
