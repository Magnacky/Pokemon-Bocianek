import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends Thread implements KeyListener  {


    JFrame ramka;
    Map mapa;
    JLabel label;
    Character character;
    ImageIcon ikona;
    JLabel bum;
    Poks_Ruch poks;

    int i = 0;




    public Frame() throws Exception {
        mapa = new Map();


        //RAMKA
        ikona = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\icon.png");
        ramka = new JFrame("Pokemon");
        ramka.setIconImage(ikona.getImage());
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.addKeyListener(this);
        ramka.setFocusable(true);
        ramka.setSize(1280, 960);
        ramka.setResizable(false);
        ramka.setVisible(true);
        ramka.setLayout(null);

        ramka.setLocationRelativeTo(null);


        //wyświetl ramkę na środku ekranu
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        ramka.setLocation(dim.width / 2 - ramka.getSize().width / 2, dim.height / 2 - ramka.getSize().height / 2);


        //BOHATER
        label = new JLabel();
        label.setIcon(character.character);
        label.setSize(character.character.getIconWidth(), character.character.getIconHeight());
        label.setLocation(640, 480);
        label.setBackground(Color.YELLOW);
        ramka.add(label);

        //MAPA
        ramka.add(mapa.panelMapy);










    }





    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            mapa.b = mapa.b + 10;
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
            character.Ruch(character.icon012, character.icon013, character.icon014, character.icon015);
            label.setIcon(character.character);
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            mapa.b = mapa.b - 10;
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
            character.Ruch(character.icon000, character.icon001, character.icon002, character.icon003);
            label.setIcon(character.character);
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            mapa.a = mapa.a - 10;
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
            character.Ruch(character.icon008, character.icon009, character.icon010, character.icon011);
            label.setIcon(character.character);
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            mapa.a = mapa.a + 10;
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
            character.Ruch(character.icon004, character.icon005, character.icon006, character.icon007);
            label.setIcon(character.character);
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            System.out.println("a" + mapa.a);
            System.out.println("b" + mapa.b);
            System.out.println("PostaćX" + label.getAlignmentX());
            System.out.println("PostaćY" + label.getAlignmentY());
            System.out.println("MapaX" + mapa.panelMapy.getAlignmentX());
            System.out.println("MapaY" + mapa.panelMapy.getAlignmentY());
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            mapa.a = 0;
            mapa.b = -19080;
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
            character.Ruch(character.icon004, character.icon005, character.icon006, character.icon007);
            label.setIcon(character.character);
            mapa.panelMapy.setLocation(mapa.a, mapa.b);
        }

        }


    @Override
    public void keyReleased (KeyEvent e){

        }





}



