package org.calculus.evaluation;

public class Verite extends Evaluation {
    private String contenu;

    public Verite(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public boolean evaluation() {
        // Logique spécifique pour toute affirmation contenant "beau" (insensible à la casse)
        return contenu.toLowerCase().contains("beau");
    }
}