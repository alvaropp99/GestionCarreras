/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncarreras.objetos;

/**
 *
 * @author alvar
 */
public class Dorsal {
   private Integer tiempo;
   private Integer num;

    public Dorsal() {
    }

    public Dorsal(Integer tiempo, Integer num) {
        this.tiempo = tiempo;
        this.num = num;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Dorsal{" + "tiempo=" + tiempo + ", num=" + num + '}';
    }
    
    
   
   
}
