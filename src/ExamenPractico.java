/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MarcosB <your.name at your.org>
 */
public class ExamenPractico extends Examen {

    public ExamenPractico(String asignatura, Integer minutos) {
        super(asignatura, minutos);
    }
    
    
    @Override
    public Integer getEnergia() {
        int energia = 100;
        for (int i = 0; i < minutos; i+=2) {
                energia -= 1;
            }
        energiaNecesaria = energia;
        return energiaNecesaria;
    }
    
    @Override
    public void hacer() {
        System.out.println("Haciendo examen practico de la asignatura "+this.getAsignatura());
    }
    
    
    
    
}
