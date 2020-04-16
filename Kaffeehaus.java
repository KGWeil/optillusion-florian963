
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{  
    int s= 40;//seitenlänge der Quadrate
    int [] abstaende = {10, 20, 30, 20, 10, 20, 30, 20, 10};// verschiebung der Quadrate
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);//größe des Fensters

    }        

    //Methode für 10 graue Parallelen
    public void parallelen () {
        stroke (125); //Farbe grau
        for (int i=0; i<=9;i++) {
            line(0, 5+i*s, 640, 5+i*s);
        }
    }

    //Quadrate der ersten Reihe
    public void zeichneQuadrate () {
        fill(0); //schwarz
        for (int j=0; j<=7;j++) {
            square (10+2*s*j, 5, s);
        }
    }

    //alle Quadrate
    public void zeichneAlleQuadrate () {
        fill (0);
        for (int k=0; k<=8;k++) {
            for (int j=0; j<=7;j++) {
                square (abstaende[k]+2*s*j, 5+k*s, s);
            }
        }
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup() 
    {
        background (255); //hintergrundfarbe weiss
        parallelen (); //Parallelen werden gezeichnet
        zeichneAlleQuadrate(); //alle quadrate werden gezeichnet
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
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
