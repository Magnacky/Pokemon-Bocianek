import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Poks_Ruch {


    public static int pozycja = 1;
    public static JLabel label;
    public static Runnable runners;
    public static Thread thread;
    int a = 600;
    int b = 600;
    public static String path = "C:\\Users\\piotrc\\Desktop\\Base\\Poks\\Pok\\006_Charizard_MegaX\\";

    public static ImageIcon icon000 = new ImageIcon(path + "tile000.png");
    public static ImageIcon icon001 = new ImageIcon(path + "tile001.png");
    public static ImageIcon icon002 = new ImageIcon(path + "tile002.png");
    public static ImageIcon icon003 = new ImageIcon(path + "tile003.png");


    public static ImageIcon icon004 = new ImageIcon(path + "tile004.png");
    public static ImageIcon icon005 = new ImageIcon(path + "tile005.png");
    public static ImageIcon icon006 = new ImageIcon(path + "tile006.png");
    public static ImageIcon icon007 = new ImageIcon(path + "tile007.png");


    public static ImageIcon icon008 = new ImageIcon(path + "tile008.png");
    public static ImageIcon icon009 = new ImageIcon(path + "tile009.png");
    public static ImageIcon icon010 = new ImageIcon(path + "tile010.png");
    public static ImageIcon icon011 = new ImageIcon(path + "tile011.png");


    public static ImageIcon icon012 = new ImageIcon(path + "tile012.png");
    public static ImageIcon icon013 = new ImageIcon(path + "tile013.png");
    public static ImageIcon icon014 = new ImageIcon(path + "tile014.png");
    public static ImageIcon icon015 = new ImageIcon(path + "tile015.png");

    public static ImageIcon rysunek = icon008;

    Poks_Ruch(int x, int y) {

        label = new JLabel();
        label.setIcon(rysunek);
        label.setSize(rysunek.getIconWidth(), rysunek.getIconHeight());
        label.setLocation(x, y);
        //label.setBackground(Color.YELLOW);


        runners = new Runnable() {

            @Override
            public void run() {


                while (true) {

                    if (pozycja == 1) {
                        for (int i = 0; i < 60; i++) {
                            Animacja();
                            a = a + 4;
                            label.setIcon(rysunek);
                            label.setLocation(x + a, y + b);
                            label.setSize(rysunek.getIconWidth(), rysunek.getIconHeight());
                            System.out.println("A: " + a + "B: " + b);
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        pozycja = 2;
                    }

                    if (pozycja == 2) {
                        for (int i = 0; i < 60; i++) {
                            Animacja();
                            b = b + 4;
                            label.setIcon(rysunek);
                            label.setLocation(x + a, y + b);
                            label.setSize(rysunek.getIconWidth(), rysunek.getIconHeight());
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        pozycja = 3;
                    }

                    if (pozycja == 3) {
                        for (int i = 0; i < 60; i++) {
                            Animacja();
                            a = a - 4;
                            label.setIcon(rysunek);
                            label.setLocation(x + a, y + b);
                            label.setSize(rysunek.getIconWidth(), rysunek.getIconHeight());
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        pozycja = 4;
                    }

                    if (pozycja == 4) {
                        for (int i = 0; i < 60; i++) {
                            Animacja();
                            b = b - 4;
                            label.setIcon(rysunek);
                            label.setLocation(x + a, y + b);
                            label.setSize(rysunek.getIconWidth(), rysunek.getIconHeight());
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        pozycja = 1;
                    }

                }
            }

        };

        thread = new Thread(runners);
        thread.start();


        ;

        Ruch();


    }


    public static void Ruch() {

        //TimeUnit.SECONDS.sleep(1);

    }

    public static void Animacja() {

        if(pozycja == 1) {
            if (rysunek == icon008) {
                rysunek = icon009;
            } else if (rysunek == icon009) {
                rysunek = icon010;
            } else if (rysunek == icon010) {
                rysunek = icon011;
            } else if (rysunek == icon011) {
                rysunek = icon008;
            } else {
                rysunek = icon008;
            }

        }

        if(pozycja == 2) {
            if (rysunek == icon001) {
                rysunek = icon002;
            } else if (rysunek == icon002) {
                rysunek = icon003;
            } else if (rysunek == icon003) {
                rysunek = icon000;
            } else if (rysunek == icon000) {
                rysunek = icon001;
            } else {
                rysunek = icon000;
            }

        }

        if(pozycja == 3) {
            if (rysunek == icon004) {
                rysunek = icon005;
            } else if (rysunek == icon005) {
                rysunek = icon006;
            } else if (rysunek == icon006) {
                rysunek = icon007;
            } else if (rysunek == icon007) {
                rysunek = icon004;
            } else {
                rysunek = icon004;
            }

        }

        if (pozycja == 4) {
                if (rysunek == icon012) {
                    rysunek = icon013;
                } else if (rysunek == icon013) {
                    rysunek = icon014;
                } else if (rysunek == icon014) {
                    rysunek = icon015;
                } else if (rysunek == icon015) {
                    rysunek = icon012;
                } else {
                    rysunek = icon012;
                }


            }
        }


    class Watek extends JButton implements ActionListener {


        Watek() {
            addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {


        }
    }
}