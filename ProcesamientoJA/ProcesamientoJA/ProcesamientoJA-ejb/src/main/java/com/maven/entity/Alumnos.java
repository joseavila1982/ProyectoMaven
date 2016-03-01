/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JOSE
 */
@Entity
@Table(name = "ALUMNOS", catalog = "", schema = "JA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumnos.findAll", query = "SELECT a FROM Alumnos a"),
    @NamedQuery(name = "Alumnos.findByMatricula", query = "SELECT a FROM Alumnos a WHERE a.matricula = :matricula"),
    @NamedQuery(name = "Alumnos.findByNombre", query = "SELECT a FROM Alumnos a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumnos.findByApp", query = "SELECT a FROM Alumnos a WHERE a.app = :app"),
    @NamedQuery(name = "Alumnos.findByApm", query = "SELECT a FROM Alumnos a WHERE a.apm = :apm"),
    @NamedQuery(name = "Alumnos.findByEdad", query = "SELECT a FROM Alumnos a WHERE a.edad = :edad"),
    @NamedQuery(name = "Alumnos.findBySexo", query = "SELECT a FROM Alumnos a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Alumnos.findByFechaRegistro", query = "SELECT a FROM Alumnos a WHERE a.fechaRegistro = :fechaRegistro")})
public class Alumnos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "MATRICULA")
    private BigDecimal matricula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "APP")
    private String app;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "APM")
    private String apm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EDAD")
    private BigInteger edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "SEXO")
    private String sexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @JoinColumn(name = "USUARIO", referencedColumnName = "USUARIO")
    @ManyToOne(optional = false)
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
