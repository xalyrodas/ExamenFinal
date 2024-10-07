package service;

import model.Tarea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataTareas {
    private ArrayList<Tarea> listatarea;
        public DataTareas (){
            listatarea = new ArrayList<>();
            listatarea.add(new Tarea("barrer", "la cocina", LocalDate.now().plusDays(1),"pendiente"));
            listatarea.add(new Tarea("trapear", "el baño", LocalDate.now().plusDays(2),"completado"));
            listatarea.add(new Tarea("Estudiar", "matematica", LocalDate.now().plusDays(3),"en progreso"));
            listatarea.add(new Tarea("Formatear", "la compu ", LocalDate.now().plusDays(1),"en progreso"));
            listatarea.add(new Tarea("reparar", "el mueble", LocalDate.now().plusDays(5),"pendiente"));
        }
    public ArrayList<Tarea> getListasalas() {
        return listatarea;
    }
}
