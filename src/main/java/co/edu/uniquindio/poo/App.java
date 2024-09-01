package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;


/** Programa que simula un cajero automático
 *  Autor: Fernando Ramos Martinez
 *  Fecha: 18-Agosto-2024
 *  Licencia GNU GPL V3
 */


public class App {
    public static void main(String[] args) {
        final int saldo_inicial = 50000;
        

        int option;

        option = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a su cajero automático\n\n"
                + "1. Ingrese dinero a su cuenta\n"
                + "2. Retirar dinero de la cuenta\n"
                + "3. Salir\n\n"
                + "Ingrese una opción"));

        float Ingrese, saldoActual, retirar;

        switch (option) {
            case 1:
                Ingrese = Float.parseFloat(JOptionPane.showInputDialog("Escriba la cantidad que desea ingresar"));
                saldoActual = saldo_inicial + Ingrese;
                JOptionPane.showMessageDialog(null, "Usted tiene actualmente " + saldoActual);
                break;

            case 2:
                retirar = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar"));
                if (retirar > saldo_inicial) {
                    JOptionPane.showMessageDialog(null, "NO PUEDE RETIRAR - Saldo insuficiente");
                } else {
                    saldoActual = saldo_inicial - retirar;
                    JOptionPane.showMessageDialog(null, "Le queda " + saldoActual);
                }
                break;

            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vuelve y digite una opción válida");
                break;
        }
    }
}