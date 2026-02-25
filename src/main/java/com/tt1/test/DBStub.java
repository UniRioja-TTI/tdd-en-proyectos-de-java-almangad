package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class DBStub {
    private List<ToDo> tareas;
    private List<String> emails;

    public DBStub() {
        this.tareas= new ArrayList<>();
        this.emails= new ArrayList<>();
    }

    public void create(ToDo t){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public ToDo read(String nombre){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public void update(ToDo t){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
    public void delete(ToDo t){
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void addCorreo(String correo){
        emails.add(correo);
    }

    public List<ToDo> getTareas() {
        return tareas;
    }
    public List<String> getEmails() {
        return emails;
    }
}
