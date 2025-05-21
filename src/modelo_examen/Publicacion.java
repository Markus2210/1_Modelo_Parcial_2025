    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_examen;

import java.util.Objects;

/**
 *
 * @author marco
 */
public abstract class Publicacion {
    private String titulo;
    private int anio;

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Publicacion other = (Publicacion) obj;
        if (getAnio() != other.getAnio()) {
            return false;
        }
        return getAnio() == other.getAnio() 
                && getTitulo().equals(other.getTitulo());
    }

    
    
    
    
    
}
