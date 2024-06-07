package org.calculus.evaluation;

public class Affirmation extends Evaluation {
    private String contenu;

    public Affirmation(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public boolean evaluation() {
        // Logique d'évaluation de l'affirmation
        return false;
    }
}