package org.calculus.calculus;

import org.calculus.calculusratiocinator.CalculusRatiocinator;
import org.calculus.evaluation.Affirmation;
import org.calculus.evaluation.Mensonge;
import org.calculus.evaluation.Verite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculusApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testCalculusRatiocinator() {
        CalculusRatiocinator cr = new CalculusRatiocinator();
        assertEquals("", cr.evaluate(null));
        assertEquals("vrai", cr.evaluate(new Verite("Lou est beau")));
        assertEquals("vrai", cr.evaluate(new Verite("Lou est BEAU")));
        assertEquals("vrai", cr.evaluate(new Verite("Lou est très beau")));
        assertEquals("faux", cr.evaluate(new Mensonge("Lou est pauvre")));
        assertEquals("faux", cr.evaluate(new Mensonge("Lou est PAUVRE")));
        assertEquals("vrai", cr.evaluate(new Affirmation("Lou est beau et Lou est pauvre")));
        assertEquals("vrai", cr.evaluate(new Affirmation("Lou est pauvre et Lou est généreux")));
        assertEquals("vrai", cr.evaluate(new Affirmation("Lou est beau ou Lou est généreux et Lou est pauvre")));
        assertEquals("vrai", cr.evaluate(new Affirmation("Premièrement : « Lou est beau ou Lou est généreux. Donc Lou est pauvre. » Et deuxièment : Lou est pauvre ou Lou est généreux »")));
    }
}