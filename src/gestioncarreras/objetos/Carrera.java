/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncarreras.objetos;

import java.util.Date;
import java.util.Map;
import gestioncarreras.objetos.Corredor;
import java.util.ArrayList;


public class Carrera {
    
    private String nombre;
    private Date fecha;
    private String lugar;
    private Integer nParticipantes;

    public Carrera(String nombre, Date fecha, String lugar, Integer nParticipantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.nParticipantes = nParticipantes;
    }

    

    public Carrera() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getnParticipantes() {
        return nParticipantes;
    }

    public void setnParticipantes(Integer nParticipantes) {
        this.nParticipantes = nParticipantes;
    }

    
    public String[] infoCarrera(){
        String[] values=new String[5];
        values[0]=nombre;
        values[1]=fecha.toString();
        values[2]=lugar;
        values[3]=nParticipantes.toString();
        
        return values;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + ", nParticipantes=" + nParticipantes +'}';
    }
    
    
}
