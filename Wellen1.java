
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{     
    int s=60;
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,250);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneAlleQuadrate ();
        linien();
    }

    public void zeichneQuadrat( int x, int y, int farbe, boolean links )
    {
        fill(farbe);
        square(x, y, s);
        if (farbe ==255)
        {
            fill (0); //wenn weiss mach schwarz
        }
        else 
        {
            fill(255); //wenn schwarz mach weiss
        }

        if (links)
        {  
            circle(x+s*1/5, y+s*1/5, s*1/4); //links oben
            circle(x+s*1/5, y+s*4/5, s*1/4); //links unten
        } 
        else 
        {   
            circle(x+s*4/5, y+s*1/5, s*1/4); //rechts oben
            circle(x+s*4/5, y+s*4/5, s*1/4); //rechts unten 
        }

    }

    public void zeichneAlleQuadrate() {  
        noStroke();
        int aktuellefarbe =255;
        boolean posAktuell =true;
        for (int k=0; k<=3; k++) {
            for (int i=0; i<=7;i++) 
            {
                zeichneQuadrat(i*s, k*s, aktuellefarbe, posAktuell);

                if (aktuellefarbe== 255)
                {
                    aktuellefarbe=0;
                }
                else
                {
                    aktuellefarbe=255;
                }

            }
            if (aktuellefarbe == 255) 
            {
                aktuellefarbe = 0;
            } 
            else 
            {
                aktuellefarbe = 255;
            }
            
            if (posAktuell == true) 
            {
                posAktuell = false;
            } 
            else 
            {
                posAktuell = true;
            }
        }
    }
    public void linien()
    {
        stroke(8, 250, 78);  // Linienfarbe hellgrün
        strokeWeight(4);
        for (int i=0; i<=2; i++) {
            line(0, s+s*i, 8*s, s+s*i);
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
        PApplet.main(new String[] {Wellen1.class.getName() });
    }

}
