/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.negocio;

import com.maven.dominio.Login;
import javax.ejb.Remote;

/**
 *
 * @author JOSE
 */
@Remote
public interface NegocioLogin {
    Login validarLogin(Login obj) throws Exception;
}
