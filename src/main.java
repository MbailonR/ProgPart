/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MarcosB <your.name at your.org>
 */
public class main {
    public static void main(String[] args) {
        Persona yo = new Persona("Marcos", 100.0);
        Accion a=new ExamenPractico("prog", 60);
        Accion b=new ExamenTest( 100, false, "contornos");
        yo.addTarea(a);
        yo.hacerTareas();
        System.out.println(yo.getEnergia());
    }
}
