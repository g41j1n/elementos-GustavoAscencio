/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gdev.webappb.model;

/**
 *
 * @author gaijin
 */
public class crearRegistro {
    
    public static void main(String args[]){
        Perro p=new Perro();
        p.setNombre("Yoshi");
        
        Persona x=new Persona();
        x.setPerro(p);
    }
    
}
