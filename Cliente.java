/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavuelo;

/**
 *
 * @author Maytan
 */
public class Cliente {
    
    private final String idCliente;
    private final String contrasenaCliente;
    private String nombreCliente;
    
    
    public Cliente(String idCliente, String contrasenaCliente) {
        this.idCliente = idCliente;
        this.contrasenaCliente = contrasenaCliente;
    }
    
    
    public String getIdCliente() {
        return idCliente;
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }

    public String getContrasenaCliente() {
        return contrasenaCliente;
    }
    
    public void MostrarDatosCliente(){
        
        System.out.println("ID: "+idCliente);
        System.out.println("Contrasena: "+contrasenaCliente);
        System.out.println("Nombre registrador: "+nombreCliente);
        System.out.println("-- -- --- -- --");
    }
    
}
