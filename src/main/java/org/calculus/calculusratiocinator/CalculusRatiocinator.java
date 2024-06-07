package org.calculus.calculusratiocinator;

import org.calculus.evaluation.Evaluation;

public class CalculusRatiocinator {

    public String evaluate(Evaluation evaluation) {
        if (evaluation == null) {
            return ""; 
        }
        return evaluation.evaluation() ? "vrai" : "faux";
    }
}