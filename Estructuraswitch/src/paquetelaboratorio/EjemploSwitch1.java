/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetelaboratorio;

import java.util.Scanner;

/**
 *
 * @author INSPIRON
 */
public class EjemploSwitch1 {

    // Método main 
    public static void main(String[] args) {
    
    // Variable
        String placa_carro;
    // Entrada por pantalla 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su placa de vehículo");
        placa_carro = entrada.nextLine();
        
        // chart.At(0) para ubicar la primera letra 
        char valor = placa_carro.charAt(0);
        switch (valor) {
            
        // Case con la inical de las placas de cada provincia de la Costa
            case 'e':
            case 'E':
                System.out.printf("Esta placa %s  pertenece a provincia de"
                        + " Esmeraldas\n", placa_carro.toUpperCase());
                break;

            case 'm':
            case 'M':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Manabí\n", placa_carro.toUpperCase());
                break;

            case 'g':
            case 'G':
                System.out.printf("Esta placa %s pertenece a la provincia del"
                        + " Guayas\n", placa_carro.toUpperCase());
                break;

            case 'y':
            case 'Y':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Santa Elena\n", placa_carro.toUpperCase());
                break;

            case 'o':
            case 'O':
                System.out.printf("Esta placa %s pertenece a la provincia del"
                        + "Oro \n", placa_carro.toUpperCase());

                break;
            case 'j':
            case 'J':
                System.out.printf("Esta placa %s pertenece a la provincia de"
                        + " Santo Domingo de los Tsáchilas\n" 
                        , placa_carro.toUpperCase());
                break;

            case 'r':
            case 'R':
                System.out.printf("Esta placa %s pertenece a la provincia"
                        + "de los ríos \n", placa_carro.toUpperCase());
                break;
                
            // Caso por defecto si no encuentra valor 
                
            default:
                System.out.printf("Esta placa %s no pertenece a la región"
                        + " costa\n", placa_carro.toUpperCase());
        }
    }
}
