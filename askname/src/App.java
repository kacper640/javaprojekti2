import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          Scanner in = new Scanner(System.in);
        String input;

        System.out.println("What is your name?");
        input = in.nextLine();
        if (input.equals(""))
        {
            System.out.println( "Error");
        }

        else 
        { System.out.println("Your name is " + input + ".");

        }
        
       
 Scanner in2 = new Scanner(System.in);
    String input2;
    int age;
    
    
    
    System.out.println("What is your name?");
    input2 = in2.nextLine();
{
    System.out.println("How old are you?");
    age = Integer.parseInt(in2.nextLine());
}


    System.out.println ( "Your name is " + input2 + " and you are " + age + " years old.");
   
    
Scanner in3 = new Scanner(System.in);
int result;

System.out.println("First number?");
int firstNum = Integer.parseInt(in3.nextLine());


System.out.println("Second number?");
int secondNum = Integer.parseInt(in3.nextLine());

result = firstNum + secondNum;
System.out.println("The sum is " + result + ".");





Scanner in4 = new Scanner(System.in);
int result1;

System.out.println("First number?");
int firstNum1 = Integer.parseInt(in4.nextLine());


System.out.println("Second number?");
int secondNum1 = Integer.parseInt(in4.nextLine());

result1 = firstNum1 + secondNum1;
System.out.println(firstNum1 + " + " + secondNum1 + " = " + result1);

































    }
}
