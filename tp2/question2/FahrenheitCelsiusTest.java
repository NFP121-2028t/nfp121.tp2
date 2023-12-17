package question2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Classe-test FahrenheitCelsiusTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document © 2002 Robert A. Ballance intitulé
 * «JUnit: Unit Testing Framework».
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le même paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
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
     * Méthode appelée avant chaque appel de méthode de test.
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
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Libérez ici les ressources engagées par setUp()
    }

    /**
     * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test.
     * Ces méthodes doivent vérifier les résultats attendus à l'aide d'assertions
     * assertTrue(<boolean>).
     * Par convention, leurs noms devraient débuter par "test".
     * Vous pouvez ébaucher le corps grâce au menu contextuel "Enregistrer une méthode de test".
     */
    public void test_FahrenheitEnCelsius() {
        runTest("0 °F -> -17.7 °C", new String[]{"0"});
        runTest("100 °F -> 37.7 °C", new String[]{"100"});
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




