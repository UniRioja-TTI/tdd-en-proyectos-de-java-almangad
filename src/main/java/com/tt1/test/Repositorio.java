package com.tt1.test;

import java.util.List;

public class Repositorio {
    private static DBStub bd;

    public Repositorio() {
        bd = new DBStub();
    }

    public ToDo encontrar(ToDo t){
        return bd.read(t.getNombre());
    }
    public void completar(ToDo t){
        t.setCompletado(true);
        bd.update(t);
    }
    public void añadirToDo(ToDo t){
        bd.create(t);
    }
    public void añadirEmail(String email){
        bd.addCorreo(email);
    }
    public List<ToDo> tareas(){
        return bd.getTareas();
    }
    public List<String> emails(){
        return bd.getEmails();
    }
}
