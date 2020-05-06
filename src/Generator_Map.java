import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Generator_Map {

    public static String nazwa_pliku_mapy;
    public static File[] listOfFiles;
    public static List<String> kolekcja_parametrów;
    public static int liczba_linijek = 0;
    public static int obecna_linijka = 0;
    String liczba_porządkowa;
    String rodzaj_obiektu;
    String nazwa_obiektu;
    public static int osX;
    public static int osY;
    public static String sciezka;
    String splited;
    public static JLabel label2;
    public static String zdanieString;

    public static ImageIcon icon;
    //public static Vector<JLabel> kolekcja_elementów;


    Generator_Map() throws Exception{


        if (obecna_linijka == 0) {
            Skaner_Katalogu();
            Czytanie_Pliku_Mapy();
            System.out.println("LICZBA LINIJEK:" + liczba_linijek);
            System.out.println("OBECNA LINIJKA:" + obecna_linijka);
        }

        zdanieString = kolekcja_parametrów.get(obecna_linijka);
        System.out.println(kolekcja_parametrów);
        Separacja_Elementów();
        Generator_Elementów();

;



    }


    void Skaner_Katalogu() {
        File folder = new File("C:\\Users\\piotrc\\Desktop\\Folder");
        listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("Plik" + listOfFiles[i].getName());
                nazwa_pliku_mapy = listOfFiles[i].getName();
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println("Folder " + listOfFiles[i].getName());
            }
        }
    }


    void Czytanie_Pliku_Mapy() throws Exception {

        kolekcja_parametrów = new ArrayList<>();
        String path = "C:\\Users\\piotrc\\Desktop\\Folder\\" + nazwa_pliku_mapy;
        File file = new File(path);
        Scanner in = new Scanner(file);
        String zdanie = in.nextLine();


            try {
                while (zdanie != null) {

                    liczba_linijek++;
                    kolekcja_parametrów.add(zdanie);
                    System.out.println(zdanie);
                    zdanie = in.nextLine();


                }
            } catch (Exception e) {
                System.out.println("WYJĄTEK: " + e);
                System.out.println("LICZ: " + liczba_linijek);
            }

        }





    void Separacja_Elementów() throws Exception {
        String[] splitedArray;
        splited = zdanieString;
        splitedArray = splited.split(",");

        for (int i = 0; i < splitedArray.length; i++) {

            if (i == 0) {
                liczba_porządkowa = splitedArray[i];
            } else if (i == 1) {
                rodzaj_obiektu = splitedArray[i];
            } else if (i == 2) {
                nazwa_obiektu = splitedArray[i];
            } else if (i == 3) {
                osX = Integer.parseInt(splitedArray[i]);

            } else if (i == 4) {
                osY = Integer.parseInt(splitedArray[i]);
            } else if (i == 5) {
                sciezka = splitedArray[i];
            }

        }

        System.out.println("Liczba porządkowa:" + liczba_porządkowa);
        System.out.println("Rodzaj obiektu: " + rodzaj_obiektu);
        System.out.println("Nazwa obiektu:" + nazwa_obiektu);
        System.out.println("X: " + osX);
        System.out.println("Y: " + osY);
        System.out.println("Scieżka: " + sciezka);


    }


    public static void Generator_Elementów() throws Exception {

        icon = new ImageIcon(sciezka);
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setLocation(osX, osY);
        label.setSize(icon.getIconWidth(), icon.getIconHeight());
        System.out.println("Bum");
        label2 = label;
        obecna_linijka++;


    }
}
