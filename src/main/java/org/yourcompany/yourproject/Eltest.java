/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Eltest {

    public static void main(String[] args) {
        ArrayList<Pregunta> preguntes = inicialitzarPreguntes();
        Test test = new Test(preguntes, null, 0);

        Scanner teclat = new Scanner(System.in);
        boolean finalitzar = false;

        while (!finalitzar) {
            mostrarPregunta(test);

            System.out.println("Tria una opció: (1) Endarrera - (2) Respondre - (3) Endavant - (4) Finalitzar ");
            int opcio = teclat.nextInt();

            switch (opcio) {

                case 1:
                    if (!test.anarEndarrera()) {
                        System.out.println("Ja estàs a la primera pregunta. ");
                    }
                    continue;


                case 2: 
                System.out.print("La teva resposta és (0-" +
                                (test.getRespostesPreguntaActual().length - 1) + "): ");
                int resposta = teclat.nextInt();
                test.respondre(resposta);
                test.anarEndavant();
                continue;
            
            case 3:
                if (!test.anarEndavant()) {
                        System.out.println("Ja estàs a la darrera pregunta.");
                    }
                    continue;
            
            case 4:
                finalitzar = true;
                continue;
            
            default:
                System.out.println("Opció no vàlida");
                continue;
            }
        }

        double nota = test.solucionarTest();
        System.out.println("Has conseguit un " + nota);
    
        teclat.close();
    }
    public static void
    
        


    
}
