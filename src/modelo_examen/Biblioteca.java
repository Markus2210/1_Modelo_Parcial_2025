/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_examen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Biblioteca {

    List<Publicacion> publicaciones;

    public Biblioteca() {
        publicaciones = new ArrayList();
    }

    public boolean publicacionExiste(Publicacion pub) {
        for (Publicacion p : publicaciones) {
            if (p.getTitulo().equals(pub.getTitulo()) && p.getAnio() == pub.getAnio()) {
                return true;
            }
        }
        return false;
    }
    
    public void agregarPublicaciones(Publicacion pub){
        if(publicacionExiste(pub)){
            System.out.println(pub.getTitulo() + " de " + pub.getAnio() + " ya se encuentra en la Biblioteca");
        }else {
            publicaciones.add(pub);
            System.out.println(pub.getTitulo() + " se ha agregado exitosamente");
        }
    }  
    
    public void mostrarPublicaciones() {
        System.out.println("Buscando en la Biblioteca...");
        for (Publicacion pub : publicaciones) {
            System.out.println(pub);
        }
    }

    
   public void leerPublicaciones(){
       System.out.println("Leyendo publicaciones:");
       for(Publicacion pub : publicaciones){
           if(pub instanceof Leible){
               ((Leible)pub).leer();
           }else {
               System.out.println("No se puede leer " + pub.getTitulo() + " ya que es una ilustracion");
           }
       }
   }
}
