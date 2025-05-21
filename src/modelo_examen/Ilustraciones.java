/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_examen;

/**
 *
 * @author marco
 */
public class Ilustraciones extends Publicacion {
    private String nombreIlustrador;
    private double ancho;
    private double alto;

    public Ilustraciones(String titulo, int anio, String nombreIlustrador, double ancho, double alto) {
        super(titulo, anio);
        this.nombreIlustrador = nombreIlustrador;
        this.ancho = ancho;
        this.alto = alto;
    }

    
    
    
    @Override
    public String toString() {
        return "Ilustraciones{" + "nombreIlustrador=" + nombreIlustrador + ", ancho=" + ancho + ", alto=" + alto + '}';
    }
    
    
    
     
    
}
