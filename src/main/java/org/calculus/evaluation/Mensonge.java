package org.calculus.evaluation;

import java.text.Normalizer;

public class Mensonge extends Evaluation {
    private String contenu;

    public Mensonge(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public boolean evaluation() {
        // Normaliser la chaîne pour supprimer les accents
        String normalizedContent = Normalizer.normalize(contenu, Normalizer.Form.NFD);
        normalizedContent = normalizedContent.replaceAll("\\p{M}", "").toLowerCase();

        // Logique spécifique pour toute affirmation contenant "faux" (insensible à la casse et aux accents)
        return normalizedContent.contains("faux");
    }
}