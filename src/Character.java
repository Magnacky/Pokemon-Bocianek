import javax.swing.*;
import java.awt.*;

public class Character {


   //down
   public static ImageIcon icon000 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile000.png");
   public static ImageIcon icon001 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile001.png");
   public static ImageIcon icon002 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile002.png");
   public static ImageIcon icon003 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile003.png");

   //int left = 2;
    public static ImageIcon icon004 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile004.png");
    public static ImageIcon icon005 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile005.png");
    public static ImageIcon icon006 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile006.png");
    public static ImageIcon icon007 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile007.png");

  // int right = 3;
    public static ImageIcon icon008 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile008.png");
    public static ImageIcon icon009 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile009.png");
    public static ImageIcon icon010 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile010.png");
    public static ImageIcon icon011 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile011.png");

   //int down = 4;
    public static ImageIcon icon012 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile012.png");
    public static ImageIcon icon013 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile013.png");
    public static ImageIcon icon014 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile014.png");
    public static ImageIcon icon015 = new ImageIcon("C:\\Users\\piotrc\\Desktop\\Base\\Ash\\tile015.png");

   public static ImageIcon character = icon000;

   public static void Ruch(ImageIcon a, ImageIcon b, ImageIcon c, ImageIcon d){
       if (character == a){
           character = b;
       } else if (character == b){
           character = c;
       } else if (character == c){
           character = d;
       } else {
           character = a;
       }
   }




}
