/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.dominio;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author JOSE
 */
public class Articulos implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idArticulo;
    private String nombre;
    private String descripcion;
    private double costo;
    private double precio;

    public Articulos() {
    }

    public Articulos(BigDecimal idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Articulos(BigDecimal idArticulo, String nombre, double costo, double precio) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.costo = costo;
        this.precio = precio;
    }

    public BigDecimal getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(BigDecimal idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticulo != null ? idArticulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Articulos)) {
            return false;
        }
        Articulos other = (Articulos) object;
        if ((this.idArticulo == null && other.idArticulo != null) || (this.idArticulo != null && !this.idArticulo.equals(other.idArticulo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.maven.entity.Articulos[ idArticulo=" + idArticulo + " ]";
    }
    
}
