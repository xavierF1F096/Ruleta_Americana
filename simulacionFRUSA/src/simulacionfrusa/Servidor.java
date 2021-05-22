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
import static simulacionfrusa.RUSAservidor.proceso;

import java.net.*;
import java.io.*;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

public class Servidor extends Observable implements Runnable {

    private int PUERTO;
    private ArrayList<Socket> clientes;

    public Servidor(int puerto) {
        this.PUERTO = puerto;
        this.clientes = new ArrayList();
    }

    public void run() {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;

        //puerto de nuestro servidor
        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(PUERTO);
            proceso.setText("Servidor iniciado\n");

            //Siempre estara escuchando peticiones
            while (true) {

                //Espero a que un cliente se conecte
                sc = servidor.accept();

                proceso.setText(proceso.getText() + "Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                //Leo el mensaje que me envia
                String mensaje = in.readUTF();
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                int men = in.readInt();
                this.setChanged();
                this.notifyObservers(men);
                this.clearChanged();

                datos.Servidor_n = mensaje;
                datos.Servidor_num = men;
                // System.out.println("nombre desde le srvidor"+datos.Servidor_n);
                //System.out.println("numero desde el servior"+datos.Servidor_num);
                proceso.setText("\n" + proceso.getText() + "\ncliente:" + mensaje + "->[puntajeC:" + men + "]");
                clientes.add(sc);
                //Le envio un mensaje
                out.writeUTF("1");

                //Cierro el socket
                //sc.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
