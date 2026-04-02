package com.tt1.P5;

import java.util.List;
/** Realiza las funciones de una capa de enlace de datos*/
public class Repositorio {
    /** Instancia compartida de la base de datos simulada */
    private static DBStub bd;
    /**Constructor que inicializa la conexión con el stub de base de datos.*/
    public Repositorio() {
        bd = new DBStub();
    }
    /**
     * Busca una tarea en la base de datos
     * @param t El objeto tarea que contiene el nombre a buscar
     * @return El objeto {@link ToDo} recuperado de la base de datos
     */
    public ToDo encontrar(ToDo t){
        return bd.read(t.getNombre());
    }
    /**
     * Marca una tarea como finalizada
     * @param t La tarea a completar
     */
    public void completar(ToDo t){
        t.setCompletado(true);
        bd.update(t);
    }
    /**
     * Anyade una nueva tarea
     * @param t La tarea que se desea persistir
     */
    public void anadirToDo(ToDo t){
        bd.create(t);
    }
    /**
     * Anyade un nuevo email
     * @param email La dirección de email a registrar
     */
    public void anadirEmail(String email){
        bd.addCorreo(email);
    }

    /**
     * Obtiene las tareas
     * @return Una {@link List} con todos los objetos {@link ToDo}
     */
    public List<ToDo> tareas(){
        return bd.getTareas();
    }
    /**
     * Obtiene los emails
     * @return Una {@link List} de {@link String} con las direcciones de email
     */
    public List<String> emails(){
        return bd.getEmails();
    }
}
