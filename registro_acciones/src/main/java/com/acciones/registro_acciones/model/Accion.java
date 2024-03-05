package com.acciones.registro_acciones.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "acciones")
public class Accion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idAccion")
    private int idAccion;

    @Column(name = "NombreAccion")
    private String nombreAccion;

    @Column(name = "FechaCompra")
    private String fechaCompra;

    @Column(name = "PrecioCompraAccion")
    private int precioCompraAccion;

    @Column(name = "CantidadAcciones")
    private int cantidadAcciones;

    @Column(name = "CostoTotalCompra")
    private int costoTotalCompra;


    public int getPrecioCompraAccion() {
        return precioCompraAccion;
    }

    public int getIdAccion() {
        return idAccion;
    }

    public void setIdAccion(int idAccion) {
        this.idAccion = idAccion;
    }

    public String getNombreAccion() {
        return nombreAccion;
    }

    public void setNombreAccion(String nombreAccion) {
        this.nombreAccion = nombreAccion;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidadAcciones() {
        return cantidadAcciones;
    }

    public void setCantidadAcciones(int cantidadAcciones) {
        this.cantidadAcciones = cantidadAcciones;
    }

    public int getCostoTotalCompra() {
        return costoTotalCompra;
    }

    public void setCostoTotalCompra(int costoTotalCompra) {
        this.costoTotalCompra = costoTotalCompra;
    }  
}