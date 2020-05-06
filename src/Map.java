import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Map {

    JPanel panelMapy;
    public static int a;
    public static int b;
    Generator_Map generator_map;
    Generator_Map generator_map2;
    public static Vector<JLabel> kolekcja_kolekcji;
    public static int i = 0;
    Poks_Ruch poks;


    public Map() throws Exception {

        //PANEL MAPY
        panelMapy = new TransparentPanel();
        panelMapy.setBounds(a, b, 20000, 20000);
        //panelMapy.setLocation(a,b);
        //panelMapy.setSize(1600,900);
        //panelMapy.setBackground(Color.PINK);
        panelMapy.setLayout(null);
        panelMapy.setBackground(new Color(0,0,0,0));

        //POKS
        poks = new Poks_Ruch(a, b);
        panelMapy.add(poks.label);


        //GENERATOR MAPY
        generator_map = new Generator_Map();
        panelMapy.add(generator_map.label2);

        for (int i = 0; i < generator_map.liczba_linijek - 1; i++) {
            generator_map = new Generator_Map();
            panelMapy.add(generator_map.label2);
            System.out.println("Liczbaaaaaa:" + generator_map.obecna_linijka);
        }


    }
}

class TransparentPanel extends JPanel {
    {
        setOpaque(false);
    }
    public void paintComponent(Graphics g) {
        g.setColor(getBackground());
        Rectangle r = g.getClipBounds();
        g.fillRect(r.x, r.y, r.width, r.height);
        super.paintComponent(g);
    }
}