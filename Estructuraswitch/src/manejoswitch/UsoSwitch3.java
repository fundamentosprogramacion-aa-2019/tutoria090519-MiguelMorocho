/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoswitch;

/**
 *
 * @author INSPIRON
 */
public class UsoSwitch3 {

    public static void main(String[] args) {
        String nombre = "esmeraldAS";
        char valor = nombre.charAt(0);

        switch (valor) {
            case 'a':
            case 'A':
                System.out.printf("Nombre con inical %s de %s\n",
                        valor, nombre.toUpperCase());
                break;

            case 'e':
                System.out.printf("Nombre con inicial %s de %s\n",
                        valor, nombre.toLowerCase());
                break;

            default:
                System.out.printf("ninguna de las anteriores");
        }
    }
}
