package banque;

import banque.Compte;
import banque.exception.CompteException;
import org.junit.Test;
import junit.framework.TestCase;


public class CompteTest extends TestCase{
    @Test
    public void testDepot() throws CompteException {
        Compte c = new Compte("01010", "compteTest");
        assertEquals(0.0,c.soldeCompte());
        c.deposer(100);
        assertEquals(100.0, c.soldeCompte());
    }

    @Test
    public void testRetirer() throws CompteException{
        Compte c = new Compte("01010", "compteTest");
        assertEquals(0.0,c.soldeCompte());
        c.retirer(100);
        assertEquals(-100.0,c.soldeCompte());
    }

    @Test
    public void testProprio() throws CompteException{
        Compte c = new Compte("01010", "compteTest");
        assertEquals("compteTest",c.getProprietaire() );
        c.setProprietaire("Tixier");
        assertEquals("Tixier",c.getProprietaire() );
    }
}