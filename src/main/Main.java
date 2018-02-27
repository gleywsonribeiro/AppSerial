/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import serial.SerialCom;
import serial.SerialComLeitura;

/**
 *
 * @author Gleywson
 */
public class Main extends SerialCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Iniciando leitura serial
        SerialComLeitura leitura = new SerialComLeitura("COM1", 9600, 0);
        leitura.HabilitarLeitura();
        leitura.ObterIdDaPorta();
        leitura.AbrirPorta();
        leitura.LerDados();

        //Controle de tempo da leitura aberta na serial
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Erro na Thread: " + ex);
        }

        leitura.FecharCom();
    }
}
