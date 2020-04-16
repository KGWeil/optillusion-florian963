
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Hermanngitter2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Hermanngitter2 extends PApplet
{     
    int s= 50;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,500);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(0, 150, 255);
        Quadrate();
        Kreise ();

    }

    public void Quadrate() {

        for (int k=0; k<=6;k++){//Alle Quadrate
            for (int i=0; i<=6;i++){//Quadrate der ersten Reihe
                fill(0);
                square(s*3/4+s*i*5/4, s*3/4+s*k*5/4, s);
            }
        }
    }

    public void Kreise () {
        fill(255);
        noStroke();
        for (int m=0; m<=5;m++){
            for (int j=0; j<=5;j++){
                circle(s*15/8+s*j*5/4, s*15/8+s*m*5/4, s/3); //3 ist ungefähr die Wurzel aus 8 
                //(Durchmesser mit Satzt des Pythagoras berechnet)
            }
        }
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {

    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Hermanngitter2.class.getName() });
    }

}
