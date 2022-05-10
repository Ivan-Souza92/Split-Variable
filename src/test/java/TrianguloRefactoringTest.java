import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloRefactoringTest {

    @Test
    public void CalculoSeno(){

        TrianguloRefactoring tr = new TrianguloRefactoring();
        tr.SenoCossenoETangente(5,10,3);
        assertEquals(0.6f, tr.getSeno());
    }
    @Test
    public void CalculoCosseno(){

        TrianguloRefactoring tr = new TrianguloRefactoring();
        tr.SenoCossenoETangente(5,10,3);
        assertEquals(2.0f, tr.getCosseno());

    }
    @Test
    public void CalculoTangente(){

        TrianguloRefactoring tr = new TrianguloRefactoring();
        tr.SenoCossenoETangente(5,10,3);
        assertEquals(0.3f, tr.getTangente());
    }

}