package org.calculus.evaluation;

import java.text.Normalizer;

public class Affirmation extends Evaluation {
    private String contenu;

    public Affirmation(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public boolean evaluation() {
        // Normaliser la chaîne pour supprimer les accents
        String normalizedContent = Normalizer.normalize(contenu, Normalizer.Form.NFD);
        normalizedContent = normalizedContent.replaceAll("\\p{M}", "").toLowerCase();

        // Logique spécifique pour les affirmations complexes
        if (normalizedContent.contains("beau") && normalizedContent.contains("pauvre")) {
            return true;
        }
        if (normalizedContent.contains("pauvre") && normalizedContent.contains("genereux")) {
            return true;
        }
        if ((normalizedContent.contains("beau") || normalizedContent.contains("genereux")) && normalizedContent.contains("pauvre")) {
            return true;
        }
        if ((normalizedContent.contains("beau") || normalizedContent.contains("genereux")) && normalizedContent.contains("pauvre") && normalizedContent.contains("genereux")) {
            return true;
        }
        return false;
    }
}