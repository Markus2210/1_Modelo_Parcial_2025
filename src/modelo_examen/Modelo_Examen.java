/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo_examen;

/**
 *
 * @author marco
 */
public class Modelo_Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Ingresando a la Biblioteca...");
        biblioteca.agregarPublicaciones(new Libros("Don Quijote", 1949, "George Orwell", Genero.FICCION));
        biblioteca.agregarPublicaciones(new Revistas("National Geographic", 2021, 105));
        biblioteca.agregarPublicaciones(new Ilustraciones("Dibujo del Bosque", 2020, "Ana Pérez", 30.5, 40.2));
        biblioteca.agregarPublicaciones(new Libros("Don Quijote", 1949, "George Orwell", Genero.FICCION)); // Duplicado

        System.out.println();
        biblioteca.mostrarPublicaciones();
        System.out.println();
        biblioteca.leerPublicaciones();
    }

}
