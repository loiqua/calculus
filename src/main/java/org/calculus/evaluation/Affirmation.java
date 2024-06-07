package org.calculus.evaluation;

import java.text.Normalizer;
import java.util.regex.Pattern;

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

        // Logique spécifique pour toute affirmation contenant "genereux" (insensible à la casse et aux accents)
        return normalizedContent.contains("genereux");
    }
}