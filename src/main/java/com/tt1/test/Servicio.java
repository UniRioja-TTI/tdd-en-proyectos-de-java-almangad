package com.tt1.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Servicio {
    private Repositorio rep;

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

    public ToDo crearToDo(String nombre, Date fLim){
        caducados();
        return new ToDo(nombre, fLim);
    }
    public void addEmail(String email){
        caducados();
        rep.añadirEmail(email);
    }
    public void finalizar(ToDo t){
        caducados();
        rep.completar(t);
    }
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
