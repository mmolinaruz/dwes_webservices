/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvm.daw.dwes.webservices1.dominio;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oem
 */
@XmlRootElement(name="cliente")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String codPostal;
    private String ciudad;

    public Cliente(int id, String nombre, String apellidos, String direccion, String codPostal, String ciudad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nom) { this.nombre = nom; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String dir) { this.direccion = dir; }

    public String getCodPostal() { return codPostal; }
    public void setCodPostal(String cp) { this.codPostal = cp; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
}