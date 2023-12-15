package question2;


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
    question2.FahrenheitCelsius f1;
    question2.FahrenheitCelsius f2;
    question2.FahrenheitCelsius f3;
        
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
        f1 = new question2.FahrenheitCelsius();
        f2 = new question2.FahrenheitCelsius();
        f3 = new question2.FahrenheitCelsius();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        
    }

    /**
     * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test.
     * Ces méthodes doivent vérifier les résultats attendus à l'aide d'assertions
     * assertTrue(<boolean>).
     * Par convention, leurs noms devraient débuter par "test".
     * Vous pouvez ébaucher le corps grâce au menu contextuel "Enregistrer une méthode de test".
     */
    public void test_FahrenheitEnCelsius()
    {
        assertEquals(" 2006 °F -> 1096.6 °C ?", 1096.6, f1.fahrenheitEnCelsius(2006), 0.1);
        assertEquals("   54 °F -> 12.2 °C ?", 12.2, f2.fahrenheitEnCelsius(54), 0.1);
    }
}



