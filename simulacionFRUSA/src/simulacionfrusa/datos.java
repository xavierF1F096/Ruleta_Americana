/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionfrusa;

import static simulacionfrusa.RUSAcliente.rojo;

/**
 *
 * @author xavier
 */
public class datos {
    public static int folio=0;
    public static int numero_cliente=5000;
      public static int cantidad_cliente=0;
        public static String nombre_cliente="";
        
           public static int numero_compara=-2;
           
           public static boolean b = true;
           public static String Servidor_n="";
           public static int Servidor_num=0;

    void buscar() {
        int[] ruleta = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
               13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
              25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
          int i=0;
       for(i=0;i<ruleta.length;i++){
           rojo.setText(String.valueOf(ruleta[i]));           
           if(i==35){
            i=0;
           }
        }
    }
}
