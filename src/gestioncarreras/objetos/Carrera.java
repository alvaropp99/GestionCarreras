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
    private ArrayList <Corredor> corredores;

    public Carrera(String nombre, Date fecha, String lugar, Integer nParticipantes, ArrayList<Corredor> corredores) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.nParticipantes = nParticipantes;
        this.corredores = corredores;
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

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(ArrayList<Corredor> corredores) {
        this.corredores = corredores;
    }
    
    public String[]infoCarrera(){
        String[]carrera=new String[6];
        carrera[0]=nombre;
        carrera[1]=fecha.toString();
        carrera[2]=lugar;
        carrera[3]=nParticipantes.toString();
        carrera[4]=corredores.toString();
        
        return carrera;
        
    }

    @Override
    public String toString() {
        String carrera="Nombre: "+nombre+"\nFecha: "+fecha+"\nLugar: "+lugar+
                "\nParticipantes: "+nParticipantes+"\nCorredores: "+corredores;
        return carrera;
    }
}
