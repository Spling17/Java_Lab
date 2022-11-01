package JavaLab4;
import java.util.Scanner;
import JavaLab4.JavaLab4_2_calculator;

public class JavaLab4_2 {
    public static void main(String[] args) throws Exception {
      JavaLab4.JavaLab4_2_calculator calc = new JavaLab4.JavaLab4_2_calculator(); 
       Scanner scanner = new Scanner(System.in);
       String exit = "";

       while(!exit.toLowerCase().equals("quit")){
        
          System.out.println("Please type the first number:");
          double n1 = scanner.nextDouble();
          System.out.println("Choose an operation:\n"
              + " > Type + for addition\n"
              + " > Type - for subtraction\n"
              + " > Type * for multiplication\n"
              + " > Type / for division\n"
          );
          String op = scanner.next();
          System.out.println("Type the second numbere:");
          double n2 = scanner.nextDouble();


          calc.doJavaLab4_2_calculator(op, n1, n2);
          calc.printResult(op);

          System.out.println("Do you want to 'continue' or 'quit'?");

          exit = scanner.next();


       }
    }
}
