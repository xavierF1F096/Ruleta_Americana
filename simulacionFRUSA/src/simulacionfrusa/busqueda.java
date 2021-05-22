/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacionfrusa;

import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JButton;
import javax.swing.JTextField;
import static simulacionfrusa.RUSAcliente.*;

/**
 *
 * @author xavier
 */
public class busqueda implements Runnable {

    public boolean iterar;
    public int contador = 0, temp = 0;

    @Override
    public void run() {

        while (iterar) {

            contador++;
            //rojo.setText(String.valueOf(contador));

            if (contador == 1) {
                uno.setBackground(Color.green);
                treintaseis.setBackground(Color.black);

            }
            if (contador == 2) {
                uno.setBackground(Color.red);
                dos.setBackground(Color.green);

            }

            if (contador == 3) {
                tres.setBackground(Color.green);
                dos.setBackground(Color.black);
            }

            if (contador == 4) {
                cuatro.setBackground(Color.green);
                tres.setBackground(Color.red);
            }

            if (contador == 5) {
                cinco.setBackground(Color.green);
                cuatro.setBackground(Color.black);

            }

            if (contador == 6) {
                seis.setBackground(Color.green);
                cinco.setBackground(Color.red);

            }

            if (contador == 7) {
                siete.setBackground(Color.green);
                seis.setBackground(Color.black);

            }

            if (contador == 8) {
                ocho.setBackground(Color.green);
                siete.setBackground(Color.red);

            }

            if (contador == 9) {
                nueve.setBackground(Color.green);
                ocho.setBackground(Color.black);

            }

            if (contador == 10) {
                dies.setBackground(Color.green);
                nueve.setBackground(Color.red);

            }

            if (contador == 11) {
                once.setBackground(Color.green);
                dies.setBackground(Color.black);

            }

            if (contador == 12) {
                doce.setBackground(Color.green);
                once.setBackground(Color.red);

            }

            if (contador == 13) {
                trece.setBackground(Color.green);
                doce.setBackground(Color.black);

            }

            if (contador == 14) {
                catorce.setBackground(Color.green);
                trece.setBackground(Color.red);

            }

            if (contador == 15) {
                quince.setBackground(Color.green);
                catorce.setBackground(Color.black);

            }

            if (contador == 16) {
                diciseis.setBackground(Color.green);
                quince.setBackground(Color.red);

            }

            if (contador == 17) {
                diecisiete.setBackground(Color.green);
                diciseis.setBackground(Color.black);

            }

            if (contador == 18) {
                diciocho.setBackground(Color.green);
                diecisiete.setBackground(Color.red);

            }

            if (contador == 19) {
                dicinueve.setBackground(Color.green);
                diciocho.setBackground(Color.black);

            }

            if (contador == 20) {
                veinte.setBackground(Color.green);
                dicinueve.setBackground(Color.red);

            }

            if (contador == 21) {
                veintiuno.setBackground(Color.green);
                veinte.setBackground(Color.black);

            }

            if (contador == 22) {
                veintidos.setBackground(Color.green);
                veintiuno.setBackground(Color.red);

            }

            if (contador == 23) {
                veintitres.setBackground(Color.green);
                veintidos.setBackground(Color.black);

            }

            if (contador == 24) {
                veinticuatro.setBackground(Color.green);
                veintitres.setBackground(Color.red);

            }

            if (contador == 25) {
                veinticinco.setBackground(Color.green);
                veinticuatro.setBackground(Color.black);

            }

            if (contador == 26) {
                veintiseis.setBackground(Color.green);
                veinticinco.setBackground(Color.red);

            }

            if (contador == 27) {
                veintisiete.setBackground(Color.green);
                veintiseis.setBackground(Color.black);

            }

            if (contador == 28) {
                veintiocho.setBackground(Color.green);
                veintisiete.setBackground(Color.red);

            }

            if (contador == 29) {
                veintinueve.setBackground(Color.green);
                veintiocho.setBackground(Color.black);

            }

            if (contador == 30) {
                treinta.setBackground(Color.green);
                veintinueve.setBackground(Color.red);

            }

            if (contador == 31) {
                treintauno.setBackground(Color.green);
                treinta.setBackground(Color.black);

            }

            if (contador == 32) {
                treintados.setBackground(Color.green);
                treintauno.setBackground(Color.red);

            }

            if (contador == 33) {
                treintatres.setBackground(Color.green);
                treintados.setBackground(Color.black);

            }

            if (contador == 34) {
                treintacuatro.setBackground(Color.green);
                treintatres.setBackground(Color.red);

            }

            if (contador == 35) {
                treintacinco.setBackground(Color.green);
                treintacuatro.setBackground(Color.black);

            }

            if (contador == 36) {
                treintaseis.setBackground(Color.green);
                treintacinco.setBackground(Color.red);
                reiniciar();
            }

            try {
                sleep(1000);
            } catch (Exception e) {
            }

        }
    }

    public void start() {
        iterar = true;
        new Thread(this).start();
    }

    public void detener() {
        iterar = false;
    }

    public void reiniciar() {

        contador = 0;

        temp = 0;

    }

    void random() {

        if (datos.numero_compara== 1) {
            uno.setBackground(Color.green);

        }
        if (datos.numero_compara == 2) {

            dos.setBackground(Color.green);

        }

        if (datos.numero_compara == 3) {
            tres.setBackground(Color.green);

        }

        if (datos.numero_compara == 4) {
            cuatro.setBackground(Color.green);

        }

        if (datos.numero_compara == 5) {
            cinco.setBackground(Color.green);

        }

        if (datos.numero_compara == 6) {
            seis.setBackground(Color.green);

        }

        if (datos.numero_compara == 7) {
            siete.setBackground(Color.green);

        }

        if (datos.numero_compara == 8) {
            ocho.setBackground(Color.green);

        }

        if (datos.numero_compara == 9) {
            nueve.setBackground(Color.green);
           

        }

        if (datos.numero_compara == 10) {
            dies.setBackground(Color.green);
           

        }

        if (datos.numero_compara == 11) {
            once.setBackground(Color.green);
            

        }

        if (datos.numero_compara == 12) {
            doce.setBackground(Color.green);
           

        }

        if (datos.numero_compara == 13) {
            trece.setBackground(Color.green);
           

        }

        if (datos.numero_compara == 14) {
            catorce.setBackground(Color.green);

        }

        if (datos.numero_compara == 15) {
            quince.setBackground(Color.green);

        }

        if (datos.numero_compara == 16) {
            diciseis.setBackground(Color.green);

        }

        if (datos.numero_compara == 17) {
            diecisiete.setBackground(Color.green);

        }

        if (datos.numero_compara == 18) {
            diciocho.setBackground(Color.green);

        }

        if (datos.numero_compara == 19) {
            dicinueve.setBackground(Color.green);

        }

        if (datos.numero_compara == 20) {
            veinte.setBackground(Color.green);

        }

        if (datos.numero_compara == 21) {
            veintiuno.setBackground(Color.green);

        }

        if (datos.numero_compara == 22) {
            veintidos.setBackground(Color.green);

        }

        if (datos.numero_compara == 23) {
            veintitres.setBackground(Color.green);

        }

        if (datos.numero_compara == 24) {
            veinticuatro.setBackground(Color.green);

        }

        if (datos.numero_compara == 25) {
            veinticinco.setBackground(Color.green);

        }

        if (datos.numero_compara == 26) {
            veintiseis.setBackground(Color.green);

        }

        if (datos.numero_compara == 27) {
            veintisiete.setBackground(Color.green);

        }

        if (datos.numero_compara == 28) {
            veintiocho.setBackground(Color.green);

        }

        if (datos.numero_compara == 29) {
            veintinueve.setBackground(Color.green);

        }

        if (datos.numero_compara == 30) {
            treinta.setBackground(Color.green);

        }

        if (datos.numero_compara == 31) {
            treintauno.setBackground(Color.green);

        }

        if (datos.numero_compara == 32) {
            treintados.setBackground(Color.green);

        }

        if (datos.numero_compara == 33) {
            treintatres.setBackground(Color.green);

        }

        if (datos.numero_compara == 34) {
            treintacuatro.setBackground(Color.green);

        }

        if (datos.numero_compara == 35) {
            treintacinco.setBackground(Color.green);

        }

        if (datos.numero_compara == 36) {
            treintaseis.setBackground(Color.green);

        }

    }

}
