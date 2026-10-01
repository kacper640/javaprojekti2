import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      

//int[] iät = {40, 50, 23, 56} ;

// perjantai-sunnuntai lämpötilat


// int[] lampotilat;
// lampotilat = new int[3];

// lampotilat[0] = 15 ;
// lampotilat[1] = 16 ;
// lampotilat[2] = 17 ; 

// // System.out.println(lampotilat[0]);
// // System.out.println(lampotilat[1]);
// // System.out.println(lampotilat[2]);

// // Koko taulukon läpikäynti for-loopilla, huomaa i
// for (int i=0 ;  i < 3 ; i++)
// {
// System.out.println(lampotilat[i]);
// }

// Arrays.sort(lampotilat);
// System.out.println("Kylmin lämpötila oli " + lampotilat[0]);
// System.out.println("Korkein lämpötila oli "+ lampotilat[lampotilat.length-1]);




// String[] huonekalut;
// huonekalut = new String[4];

// huonekalut[0] = "sohva";
// huonekalut[1] = "tuoli";
// huonekalut[2] = "pöytä";
// huonekalut[3] = "kaappi";




// for (int i=0 ; i < 4 ; i++)
// {
//     System.out.println(huonekalut[i]);

// }



//Arrays.sort(huonekalut);



//  String[] colors;
//  colors = new String[3];

//  colors[0] = "1. Green";
//  colors[1] = "2. Blue";
//  colors[2] = "3. Yellow";

//  System.out.println("Blue");

//  for (int i=0 ; i < 3 ; i++)
//  {
//      System.out.println(colors[i]);

//  }

// ARRAY
// Scanner in = new Scanner(System.in);

// int valinta;
// String[] phrase = new String[4];

// phrase[0] = "Actions speak louder than words.";
// phrase[1] = "A barking dog never bites.";
// phrase[2] = "A penny saved is a penny earned.";
// phrase[3] = "All things come to those who wait.";

// System.out.println("Pick number from 1-4.");
// valinta = Integer.parseInt(in.nextLine());

// System.out.println(phrase[valinta - 1]);




// String[] furniture = {"Table", "Sofa", "Shelf", "Painting"};

// for (int i = 0; i < furniture.length; i++) 
//     {
//     if (furniture[i].equals("Sofa")) {
//         System.out.println("Sofa found");
//     }
// }


int[] number = { 3, 6, 1};

int sum = 0;

for (int i = 0 ; i < number.length; i++)
{
    sum += number[i];

}
System.out.println(sum);









    }
}
