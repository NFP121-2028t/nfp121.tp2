package question2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Classe-test FahrenheitCelsiusTest.
 *
 * @author  (votre nom)
 * @version (un num�ro de version ou une date)
 *
 * Les classes-test sont document�es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont bas�es sur le document � 2002 Robert A. Ballance intitul�
 * �JUnit: Unit Testing Framework�.
 *
 * Les objets Test (et TestSuite) sont associ�s aux classes � tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le m�me paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque m�thode Test � ex�cuter.  Il peut y avoir
 * plus d'une m�thode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ d�couvrira automatiquement (par introspection) les m�thodes
 * Test de votre classe Test et g�n�rera la TestSuite cons�quente.
 * Chaque appel d'une m�thode Test sera pr�c�d� d'un appel de setUp(),
 * qui r�alise les engagements, et suivi d'un appel � tearDown(), qui les
 * d�truit.
 */
public class FahrenheitCelsiusTest extends junit.framework.TestCase
{
    private question2.FahrenheitCelsius f;
    
    private ByteArrayOutputStream outContent ;
    private PrintStream originalOut;
        
    /**
     * Constructeur de la classe-test FahrenheitCelsiusTest
     */
    public FahrenheitCelsiusTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        f = new question2.FahrenheitCelsius();
        
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
    }
    
    // Redirect System.out to ByteArrayOutputStream
    private void setUpStreams()
    {
        System.setOut(new PrintStream(outContent));
    }
    
    // Restore the original System.out
    private void restoreStreams()
    {
        System.setOut(originalOut);
    }
        
    /**
     * Supprime les engagements
     *
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Lib�rez ici les ressources engag�es par setUp()
    }

    /**
     * Il ne vous reste plus qu'� d�finir une ou plusieurs m�thodes de test.
     * Ces m�thodes doivent v�rifier les r�sultats attendus � l'aide d'assertions
     * assertTrue(<boolean>).
     * Par convention, leurs noms devraient d�buter par "test".
     * Vous pouvez �baucher le corps gr�ce au menu contextuel "Enregistrer une m�thode de test".
     */
    public void test_FahrenheitEnCelsius() {
        runTest("0 �F -> -17.7 �C", new String[]{"0"});
        runTest("100 �F -> 37.7 �C", new String[]{"100"});
        runTest("error : For input string: \"ZZ\"", new String[]{"ZZ"});
        runTest("error : For input string: \"1.5\"", new String[]{"1.5"});
    }
    
    public void runTest(String s, String[] args) {
        // RUN MAIN()
        setUpStreams();
        f.main(args);
        restoreStreams();
        
        // GET MAIN RESULT
        String res = outContent.toString().trim();
        outContent.reset();
        
        // Assertion with string
        assertEquals(s, res);
    }
}




