/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webja.servicios;

import com.maven.dominio.Login;

/**
 *
 * @author JOSE
 */
public interface IFaceLogin {
    Login validarLogin(Login obj) throws Exception;
}
