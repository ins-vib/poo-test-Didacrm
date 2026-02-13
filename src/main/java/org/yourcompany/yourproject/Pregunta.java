package org.yourcompany.yourproject;

public class Pregunta {
    private String enunciat;
    private String[] respostes;
    private int correcta;

    public Pregunta(int correcta, String enunciat, String[] respostes) {
        this.correcta = correcta;
        this.enunciat = enunciat;
        this.respostes = respostes;
    }

    public String getEnunciat() {
        return enunciat;
    }

    public void setEnunciat(String enunciat) {
        this.enunciat = enunciat;
    }

    public String[] getRespostes() {
        return respostes;
    }

    public void setRespostes(String[] respostes) {
        this.respostes = respostes;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }
    


    
}
