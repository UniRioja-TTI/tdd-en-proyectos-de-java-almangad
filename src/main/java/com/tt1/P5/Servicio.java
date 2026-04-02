package com.tt1.P5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Gestor de la lógica de negocio de las tareas
 */
public class Servicio {
    /** Repositorio de persistencia de datos */
    private Repositorio rep;

    /**
     * Constructor que inicializa el repositorio
     */
    public Servicio() {
        this.rep = new Repositorio();
    }
    private void caducados(){
        List<ToDo> tareas = rep.tareas();
        for (ToDo t : tareas){
            if(!(t.isCompletado())){
                if (t.getFechaLimite().after(new Date())){
                    List<String> emails = rep.emails();
                    for (String email : emails){
                        new MailerStub().enviar(email, t.getNombre() + " pasada la fecha límite");
                    }
                }
            }
        }
    }

    /**Crea una tarea
     * @param nombre El nombre de la nueva tarea
     * @param fLim La fecha límite para completar la tarea
     * @return El objeto ToDo creado
     */
    public ToDo crearToDo(String nombre, Date fLim){
        caducados();
        return new ToDo(nombre, fLim);
    }
    /**
     * Anyade un email
     * @param email La dirección de correo electrónico a añadir
     */
    public void addEmail(String email){
        caducados();
        rep.anadirEmail(email);
    }
    /**
     * Finaliza una tarea
     * @param t La tarea que se desea finalizar
     */
    public void finalizar(ToDo t){
        caducados();
        rep.completar(t);
    }
    /**
     * Devuelve las tareas pendientes
     * @return Lista de objetos ToDo
     */
    public List<ToDo> pendientes(){
        caducados();
        List<ToDo> tareas = rep.tareas();
        List<ToDo> p = new ArrayList<>();
        for (ToDo t : tareas){
            if(!(t.isCompletado())){
                p.add(t);
            }
        }
        return p;
    }
}
