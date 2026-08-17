package com.gestortareas;

public class Tarea {
    private String titulo;
    private boolean completada;

    public Tarea(String titulo) {
        this.titulo = titulo;
        this.completada = false;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
