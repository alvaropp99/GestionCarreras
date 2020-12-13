/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncarreras.objetos;

import java.util.Date;

public class Corredor {
    
    private String nombre;
    private String dni;
    private Date fecha;
    private String direc;
    private Integer tfno;
    
    public Corredor(String nombre, String dni, Date fecha, String direc, Integer tfno) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
        this.direc = direc;
        this.tfno = tfno;
    }

    public Corredor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public int getTfno() {
        return tfno;
    }

    public void setTfno(Integer tfno) {
        this.tfno = tfno;
    }
    
    public String[]infoCorredor(){
        String[]corredor=new String[5];
        corredor[0]=nombre;
        corredor[1]=dni;
        corredor[2]=fecha.toString();
        corredor[3]=direc;
        corredor[4]=tfno.toString();
        
        return corredor;
    }
    
    
    
}
