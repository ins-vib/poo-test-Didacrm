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
    public static void mostrarPregunta(Test test) {

        System.out.println("\nPregunta" + (test.getNumeroPregunta()+ 1) + " ." + test.getEnunciatPreguntaActual());
        
        String[] respostes = test.getRespostesPreguntaActual();

        for (int i = 0; i < respostes.length; i++) {
            System.out.println(i + ". " + respostes[i]);
        }
    }

    public static ArrayList<Pregunta> inicialitzarPreguntes() {

        ArrayList<Pregunta> preguntes = new ArrayList<>();

        preguntes.add(new Pregunta("Qui va pintar el Giuernica",
        new String[]{"Velàzquez", "Goya", "Picasso"}, 2));
        preguntes.add(new Pregunta("Qui va escriure Alicia al país de les meravelles",
        new String[]{"Grimm", "Steveson", "Carrol"}, 2));
        preguntes.add(new Pregunta("Quina és la magnitud que relaciona espai i temps",
        new String[]{"velocitat", "temperatura", "pes"}, 0));
        preguntes.add(new Pregunta("Si el radi d'una circumferència és 4, el seu diàmetre és",
        new String[]{"4", "8", "12", "14"}, 1));
        preguntes.add(new Pregunta("Quants segons té 1 hora",
        new String[]{"420", "760", "3600"}, 2));
        preguntes.add(new Pregunta("Quin no és un llenguatge de programació",
        new String[]{"java", "php", "samsung"}, 2));
        preguntes.add(new Pregunta("Dins un termòmetre hi trobem",
        new String[]{"aigua", "aigua amb gas", "mercuri"}, 2));
        preguntes.add(new Pregunta("L'Acropolis es troba a",
        new String[]{"Atenes", "Roma", "París"}, 0));
        preguntes.add(new Pregunta("L'element químic amb símbol Fe és ",
        new String[]{"Estronci", "Ferro", "Feril·li"}, 1));
        preguntes.add(new Pregunta("La capital d'Estats Units és",
         new String[]{"Georgetown", "New York", "Washington"}, 2));



    
    

return preguntes;

    
        


    
}
}