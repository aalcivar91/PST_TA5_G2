package com.example.pst_ta5_g2;

public class Event {
    private String hora;
    private String descripcion;
    private String lugar;

    public Event(String hora, String descripcion, String lugar){
        this.hora = hora;
        this.descripcion = descripcion;
        this.lugar = lugar;
    }

    public String getHora(){
        return hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getLugar() {
        return lugar;
    }
}