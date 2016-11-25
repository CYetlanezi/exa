/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menesesramirezclaudia;

/**
 *
 * @author hca
 */
public class Pixel {
    private int rojo;
    private int verde;
    private int azul;
     private int fi;
      
    public Pixel(int r, int v, int b,int fi){
        this.rojo = r;
        this.verde = v;
        this.azul = b;
        this.fi = fi;
    }
    public void setRojo(int re){
        this.rojo = re;
    }
    public int getRojo(){
        return rojo;
    }
    public int getFila(){
        return fi+1;
    }
    public String toString(){
        return ""+rojo+" "+verde+" "+azul+"\n";
    }
}
