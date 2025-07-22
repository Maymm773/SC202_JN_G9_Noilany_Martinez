/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavuelo;

/**
 *
 * @author Maytan
 */
public class Administrador {
    
    private final String idAdministrador;
    private final String contrasenaAdmin;
    private String nombreAdmin;
    
    
    public Administrador(String idAdministrador, String contrasenaAdmin) {
        this.idAdministrador = idAdministrador;
        this.contrasenaAdmin = contrasenaAdmin;
    }
    
    
    public String getIdAdministrador() {
        return idAdministrador;
    }
    
    public String getNombreAdmin(){
        return nombreAdmin;
    }
    
    public void setNombreAdmin(String nombreAdmin){
        this.nombreAdmin=nombreAdmin;
    }

    public String getContrasenaAdmin() {
        return contrasenaAdmin;
    }
    
    public void MostrarDatosAdmin(){
        
        System.out.println("ID: "+idAdministrador);
        System.out.println("Contrasena: "+contrasenaAdmin);
        System.out.println("Nombre registrador: "+nombreAdmin);
        System.out.println("-- -- --- -- --");
    }
    
}
