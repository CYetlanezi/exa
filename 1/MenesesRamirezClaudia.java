package menesesramirezclaudia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenesesRamirezClaudia {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Pixel vectorpi[][] = new Pixel[3][3];
        int ro [][] = new int[9][3];
        File datos =new File("Pixe.txt");
        Scanner leer;
        try{
        leer = new Scanner(datos);
        }
        catch(Exception e){
            leer =null;
        }
        if(leer != null){
            int r =0,v=0,b=0,c=0,h=0;
            while(leer.hasNextInt()){
                for(int l = 0; l <3; l++){
                    for(int i = 0; i <3; i++){
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
                            vectorpi[l][i] = new Pixel(r,v,b,l,i);
                            System.out.println(vectorpi[l][i].toString());
                            ro[h][0] =   vectorpi[l][i].getRojo();
                            ro[h][1] = l;
                            ro[h][2] = i;
                            h++;
                        }
                }
            }
        leer.close();
        int ind [][] = new int[9][3];
        ind = Ordenar(ro);
        for(int i = 0; i <9; i++){
                System.out.println(vectorpi[ind[i][1]][ind[i][2]].getRojo()+" fila : "+ind[i][1]+" columna : "+ind[i][2]);
        }
        }
    }
    
    public static int [][] Ordenar(int [][] rojo){
      int ind [][] = new int[9][3];
      int roj [][]=  new int[9][3];
      roj = rojo;
      for(int i = 0; i <9; i++){
              ind[i][0] = Mayor(roj);
              ind[i][1]= roj[ind[i][0]][1];
              ind[i][2]= roj[ind[i][0]][2];
              roj[ind[i][0]][0] = 0;
       }
      return ind;     
    }
    public static int  Mayor(int [][] rojo){
       int mayor=0,indmayor = 0;
       for(int j = 0; j < 9; j++){
            if(rojo[j][0] > mayor){
                mayor = rojo[j][0];
                indmayor = j;
            }
       }
       return indmayor;
    }
}
