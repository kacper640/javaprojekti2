import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     
     
   
// Random arpoja = new Random();


// int numero1 = arpoja.nextInt(10) + 1;

// int numero2 = arpoja.nextInt(10) + 1;

// int numero3 = arpoja.nextInt(10) + 1;

// System.out.println("Arvotut numerot:");

// System.out.println(numero1);

// System.out.println(numero2);

// System.out.println(numero3);



// if (numero1 == 7) {

// System.out.println("Voitit!");

// } else {

// System.out.println("Hävisit!");

// }



// kysytään käyttäjältä pin-koodia kunnes se on oikein

// Scanner in = new Scanner(System.in);

// String oikeaPin = "2222";

// String vastaus = "";

// do 
// {


// System.out.println("Anna pin-koodi:");
// vastaus = in.nextLine();

// if (vastaus.equals(oikeaPin)) {

//     System.out.println(" kirjauduit sisään!");
//     break;
// }

// else
// {
//     System.out.println( "Väärä pin-koodi, yritä uudelleen");
// }

// } while(true);







//  Scanner in = new Scanner(System.in);

//  String oikeaPin = "2222";

//  String vastaus = "";

//  do 
//  {


//  System.out.println("Anna pin-koodi:");
//  vastaus = in.nextLine();



//  } while(!oikeaPin.equals(vastaus));
// // ! tarkoittaa EI, eli nyt ehto on niin kauan loopataan kun oikeaPin EI ole vastaus
// System.out.println("Logged in");




// Scanner in = new Scanner(System.in);
// String oikeaVastaus = "Emma";
// String vastaus = "";
// String stop = "";


// do
// {
// System.out.println("Guess my name" + "(type stop to exit)");

// vastaus = in.nextLine();
// // stop = in.nextLine();
// }
//  while(!oikeaVastaus.equals(vastaus));
// System.out.println("Congratulations!");
//  int numberofguesses = 3;
//  System.out.println("You guessed " + numberofguesses + " times.");




 






        Scanner scanner = new Scanner(System.in);

        int guesses = 0;

        while (true) {
            System.out.println("Guess my name (type stop to exit)");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            guesses++;

            if (input.equals("Emma")) {
                System.out.println("Congratulations!");
                break;
            }
        }

        System.out.println("You guessed " + guesses + " times.");
    








}
}
