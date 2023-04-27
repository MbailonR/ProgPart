
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MarcosB <your.name at your.org>
 */
public class Persona implements Energetico{

    private String nombre;
    private Double capacidadVejiga;
    private Double estadoVejiga;
    private Integer energiaActual;
    private List <Accion> tareas;

    public Persona(String nombre, Double capacidadVejiga) {
        this.nombre = nombre;
        this.capacidadVejiga = capacidadVejiga;
        this.estadoVejiga = 0.0;
        this.energiaActual = 100;
        this.tareas= new ArrayList();
    }
    

    public void addTarea(Accion a){
        tareas.add(a);
    }
    
    public Integer hacerTareas(){
        int contador=0;
        for (int i = 0; i < tareas.size(); i++) {
            Integer t = tareas.get(i).getEnergia();
            if(tareas.get(i).getEnergia()<energiaActual){
                tareas.remove(i);
                contador++;
                energiaActual-= t;
            }
        }
        return contador;
    }
    
    public void vaciarVejiga(){
        this.estadoVejiga=0.0;
    }
    
    public Double beber(Bebible x){
        //Cuanto me bebo??
        while(capacidadVejiga>=estadoVejiga){
            this.energiaActual+=x.getEnergia();
        }
        return 0.0;
    }
    
    
    @Override
    public Integer getEnergia() {
        return getEnergiaActual();
    }

    public Integer getEnergiaActual() {
        return energiaActual;
    }

    
    
}
