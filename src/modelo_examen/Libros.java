/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_examen;

/**
 *
 * @author marco
 */
public class Libros extends Publicacion implements Leible{
    private String autor;
    private Genero genero;
    
    public Libros(String titulo, int anio, String autor, Genero genero){
        super(titulo, anio);
        this.autor = autor;
        this.genero = genero;
    }
    
    @Override
    public void leer(){
        System.out.println("Leyendo el libro: " + getTitulo() );
    }

    @Override
    public String toString() {
        return "Libros{" + "autor=" + autor + ", genero=" + genero + '}';
    }
    
    
    
    
}
