/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menesesramirezclaudia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hca
 */
public class MenesesRamirezClaudia {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Pixel vectorpi[] = new Pixel[9];
        int ro [] = new int[9];
        File datos =new File("Pixe.txt");
        Scanner leer;
        try{
        leer = new Scanner(datos);
        }
        catch(Exception e){
            leer =null;
        }
        if(leer != null){
            int r =0,v=0,b=0,c=0;
            while(leer.hasNextInt()){
                for(int i = 0; i <9; i++){
                        for(int k = 0; k <3; k++){
                        switch(c%3){
                            case 0:
                                r = leer.nextInt();
                                c++;
                                break;
                            case 1:
                                v = leer.nextInt();
                                c++;
                                break;
                            case 2:
                                b = leer.nextInt();
                                c++;
                                break;
                        }
                        
                        }
                        vectorpi[i] = new Pixel(r,v,b,i);
                        System.out.println(vectorpi[i].toString());
                        ro[i] =   vectorpi[i].getRojo();
                    }
                }
            }
        leer.close();
        int ind [] = new int[9];
   
        ind = Ordenar(ro);
        //Miss, A la posición le sume 1 para que no empezara en 0 como tal
        for(int i = 0; i <9; i++){
                System.out.println(vectorpi[ind[i]].getRojo()+" fila : "+vectorpi[ind[i]].getFila());
         }
   
    }
    public static int [] Ordenar(int [] rojo){
      int ind [] = new int[9];
      int roj []=  new int[9];
      roj = rojo;
      for(int i = 0; i <9; i++){
              ind[i] = Mayor(roj);
              roj[ind[i]] = 0;
              
       }
      
      return ind;     
    }
    public static int Mayor(int [] rojo){
       int mayor=0,indmayor = 0;
       for(int j = 0; j < rojo.length; j++){
            if(rojo[j] > mayor){
                mayor = rojo[j];
                indmayor = j;
                
            }
       }
       return indmayor;
    }
    
    
}
