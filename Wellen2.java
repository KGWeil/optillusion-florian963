
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen2.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen2 extends PApplet
{     
    int s=40;
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
        background (255);
        alleQuadrate1();
        alleQuadrate2();

    }

    public void grünerRand (int x, int y) {
        noStroke();
        fill ( 0, 205, 0);
        square(x, y, s);
        fill (255);
        square(x+s/10, y+s/10, s*4/5);

    }

    public void weisserRand (int a, int b) {
        noStroke();
        fill ( 255);
        square(a, b, s);
        fill (0, 205, 0);
        square(a+s/10, b+s/10, s*4/5);
    }

    public void alleQuadrate1 () {//erste,dritte,... Reihe
        for (int j=0; j<=5; j++){
            for (int i=0; i<=5;i++) {
                grünerRand(10+i*s*2, 10+j*s*2); 
                weisserRand(10+s+i*s*2,10+j*s*2);
            }
        }
    }

    public void alleQuadrate2 () {//zweite, vierte,... Reihe
        for (int j=0; j<=5; j++){
            for (int i=0; i<=5;i++) {
                grünerRand(10+s+i*s*2,s+10+j*s*2); 
                weisserRand(10+i*s*2, s+10+j*s*2);

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
        PApplet.main(new String[] {Wellen2.class.getName() });
    }

}
