package JavaLab4;
import java.util.Scanner;

public class JavaLab4_calculator {

  public static void main(String[] args){
    Scanner scan1;
  
  String continueQuit = "continue";
  do {
    int firstNum;
    scan1 = new Scanner(System.in);
    System.out.println("Please type the first number: ");
    firstNum = scan1.nextInt();

    String enterOpe;
    scan1 = new Scanner(System.in);
    System.out.println("Chose an operation:\n > Type + for addition\n > Type - for subtraction\n > Type * for multiplication\n > Type / for division");
    enterOpe = scan1.nextLine();

    int secondNum;
    scan1 = new Scanner(System.in);
    System.out.println("Please type the second number: ");
    secondNum = scan1.nextInt();
    
    switch(enterOpe){
        case "+":
        System.out.println(firstNum + " + " + secondNum + " = " + firstNum + secondNum);
        break;

        case "-":
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        break;

        case "*":
        System.out.println(firstNum + " * " + secondNum + " = " + firstNum*secondNum);
        break;

        case "/":
          if (firstNum==0||secondNum==0)
            System.out.println("cannot divide by zero");
          else 
            System.out.println(firstNum + " / " + secondNum + " = " + (firstNum/secondNum));
            break;
        
        default:
        System.out.println("Error: Please enter operators");
        break;
    }
          scan1 = new Scanner(System.in);
          System.out.println("Do you want to continue or quit?");
          continueQuit = scan1.nextLine();
      } while(continueQuit.equals ("continue"));

      System.out.println("Bye");
      scan1.close();
    }
  }
  