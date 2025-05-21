/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_examen;

/**
 *
 * @author marco
 */
public class Revistas extends Publicacion implements Leible{
    private int numeroEdicion;
    
    public Revistas(String titulo, int anio, int numeroEdicion){
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void leer(){
        System.out.println("Leyendo la revista: " + getTitulo());
    }
    
    @Override
    public String toString() {
        return "Revistas{" + "numeroEdicion=" + numeroEdicion + '}';
    }
    
}
