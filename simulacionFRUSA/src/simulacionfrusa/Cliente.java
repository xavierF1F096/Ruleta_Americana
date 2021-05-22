/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionfrusa;

/**
 *
 * @author xavier
 */
import java.util.logging.Level;
import java.util.logging.Logger;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Cliente implements Runnable{
     //Host del servidor
        private String HOST ;
        //Puerto del servidor
        private int PUERTO;
        
        DataInputStream in;
        DataOutputStream out;
         Socket sc;

    public Cliente(String host,int puerto) {
      this.HOST=host;
      this.PUERTO=puerto;
       
    }

    public void run() {

        try {
            //Creo el socket para conectarme con el cliente
             sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            enviar(datos.nombre_cliente,datos.numero_cliente);
            //out.writeUTF(datos.nombre_cliente+String.valueOf(datos.numero_cliente));

            //Recibo el mensaje del servidor
            String mensaje = in.readUTF();

            System.out.println(mensaje);

            //sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    void enviar(String n,int m){
        DataOutputStream out;
            try {
                out = new DataOutputStream(sc.getOutputStream());
                
                 out.writeUTF(n);
                 out.writeInt(m);
                
                
            } catch (IOException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

}
