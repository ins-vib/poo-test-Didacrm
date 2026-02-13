package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Test {

    private ArrayList<Pregunta> preguntes;
    private int[] respostesUsuari;
    private int numPregunta;

    public Test(ArrayList<Pregunta> preguntes, int[] respostesUsuari, int numPregunta) {
        this.preguntes = preguntes;
        this.respostesUsuari = new int[preguntes.size()];
        this.numPregunta = 0;

    for (int i = 0; i < respostesUsuari.length; i++) {
        respostesUsuari[i] = -1;
    }
}
public String getEnunciatPreguntaActual() {
    return preguntes.get(numPregunta).getEnunciat();
}
public String[] getRespostesPreguntaActual() {
    return preguntes.get(numPregunta).getRespostes();
}
public int getNumeroPregunta() {
    return numPregunta;
}
public void respondre(int resposta) {
    respostesUsuari[numPregunta] = resposta;
}
public boolean anarEndavant() {
    if (numPregunta < preguntes.size() - 1) {
        numPregunta++;
        return true;
    }
    return false;

}
public boolean anarEndarrera() {
    if (numPregunta > 0) {
        numPregunta--;
        return true;
}
return false;
}
public double solucionarTest() {
    double puntuacio = 0;
    double puntsPerPregunta = 10.0 / preguntes.size();

    for (int i = 0; i < preguntes.size(); i++) {
        if(respostesUsuari[i] != -1) {
            if(respostesUsuari[i]== preguntes.get(i).getCorrecta()) {
                puntuacio += puntsPerPregunta;
            } else {
                int numRespostes = preguntes.get(i).getRespostes().length;
                puntuacio -= (puntsPerPregunta / numRespostes);
            }
        }
    }

    if (puntuacio < 0) puntuacio = 0;

    return puntuacio;
}
}



    
    

