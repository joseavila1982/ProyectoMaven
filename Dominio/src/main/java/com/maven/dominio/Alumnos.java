/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author JOSE
 */
public class Alumnos implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal matricula;
    private String nombre;
    private String app;
    private String apm;
    private BigInteger edad;
    private String sexo;
    private Date fechaRegistro;
    private Login usuario;

    public Alumnos() {
    }

    public Alumnos(BigDecimal matricula) {
        this.matricula = matricula;
    }

    public Alumnos(BigDecimal matricula, String nombre, String app, String apm, BigInteger edad, String sexo, Date fechaRegistro) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaRegistro = fechaRegistro;
    }

    public BigDecimal getMatricula() {
        return matricula;
    }

    public void setMatricula(BigDecimal matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public BigInteger getEdad() {
        return edad;
    }

    public void setEdad(BigInteger edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Login getUsuario() {
        return usuario;
    }

    public void setUsuario(Login usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matricula != null ? matricula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumnos)) {
            return false;
        }
        Alumnos other = (Alumnos) object;
        if ((this.matricula == null && other.matricula != null) || (this.matricula != null && !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.maven.entity.Alumnos[ matricula=" + matricula + " ]";
    }
    
}
