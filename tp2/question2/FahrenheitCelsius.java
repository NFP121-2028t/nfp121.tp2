package question2;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {
     /** le point d'entrée de cette application,
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args) {
       try {
           for ( int i = 0 ; i < args.length ; i++ ) {
               int fahrenheit = Integer.parseInt(args[i]);
               float celsius = fahrenheitEnCelsius( fahrenheit );
               System.out.println(fahrenheit + "\u00B0F -> " + ((int)(celsius * 10.0)) / 10.0 + "\u00B0C");
           }
       } catch( NumberFormatException nfe ) {
           System.out.println("error : " + nfe.getMessage());
       }
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius(int f) {
        return (float) ( (5.0/9.0) * (f - 32.0) );
     }
}
