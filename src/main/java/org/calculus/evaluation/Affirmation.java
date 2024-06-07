package org.calculus.evaluation;

public class Affirmation implements Evaluation {
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