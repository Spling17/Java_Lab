import java.util.Scanner;
public class JavaLab1 {
  public static void main(String[] args) {

    /* 1 — Find the Area of a Circle
     * 
     * Write a program that takes in a user's input of the radius and 
     * calculates the area of a circle. The radius should be read as 
     * an integer from the  keyboard. Sample of user dialog: 
     * 
     * Input the radius: 3
     * Expected Output :
     * The radius is: 3 The area is: 28.274333882308138
     * Note: You can use the constant PI from Math.PI.
    */

    Scanner scan1;
    int radius;
    
    scan1 = new Scanner(System.in);
    System.out.println("Input the radius: ");
    radius = scan1.nextInt();
    
    double area = radius * radius * Math.PI;
    System.out.println("The radius is: " + radius); 
    System.out.println("The area is: " + area);

    scan1.close();

  //----------------------- Francois answer -----------------------------

      // Scanner scan11 = new Scanner(System.in);
      // System.out.println("Input the radius: ");
      // int radius2 = scan11.nextInt();
      // System.out.println("The radius is: " + radius2);
      // System.out.println("The area is: " + (Math.PI * radius2 *radius2));
      // scan11.close();
         
  //=====================================================================

  /* 2 — Convert Cents to Dollars
   * Write a program that takes in an input number of cents. 
   * The program will write out the number of dollars and cents, 
   * like this:
   * 
   * Input the cents: 324
   * Expected Output :
   * The value is 3 dollars and 24 cents.323
   * Note: Use integer arithmetic and avoid floating point arithmetic.
  */

  Scanner scan2;
  int inputCents;
    
  scan2 = new Scanner(System.in);
  System.out.println("Input the cents:"); 
  inputCents = scan2.nextInt();
  int dollers = inputCents / 100;
  int cents = inputCents % 100;
    // double dollars = Math.floor(inputCents);
    // String cents2 = String.format("%.2f",inputCents);
    // System.out.printf("The value is:, %d dollars and ,%.2d", cents + "cents");
  System.out.println("The value is " + dollers + " dollars and " + cents + " cents");

  scan2.close();

  //----------------------- Francois answer ----------------------------

    // Scanner scan21 = new Scanner(System.in);
    // System.out.println("Input the cents:");
    // int cents2 = scan21.nextInt();
    // System.out.printf("The value is %d dollar and %d cents%n", (cents2 / 100), (cents2 % 100),(cents2*100));

    // scan21.close();

  //=====================================================================

  /* 3 - Multiplication Table
   * 
   * Write a program that takes a number as input and prints 
   * its multiplication table up to 10. 
   * Sample Output:
   * 
   * Input a number: 9
   * Expected Output :
   * 9 x 1 = 9
   * 9 x 2 = 18
   * 9 x 3 = 27
   * ...
   * 9 x 10 = 90
  */

   int number = 9;
    System.out.println(number + " x 1 = " + number * 1);
    System.out.println(number + " x 2 = " + number * 2);
    System.out.println(number + " x 3 = " + number * 3);
    System.out.println(number + " x 5 = " + number * 5);
    System.out.println(number + " x 4 = " + number * 4);
    System.out.println(number + " x 6 = " + number * 6);
    System.out.println(number + " x 7 = " + number * 7);
    System.out.println(number + " x 8 = " + number * 8);
    System.out.println(number + " x 9 = " + number * 9);
    System.out.println(number + " x 10 = " + number * 10);


  //---------------------------------------------------------------------

    Scanner scan3;
    int number2;
  
    scan3 = new Scanner(System.in);

    System.out.println("Input a number: "); 
    number2 = scan3.nextInt();
    
    int num = 1;
    while(num <= 10){
      System.out.println(number2 + " x " + num + " = " + number * num);
      num++;
    }

    scan3.close();

   //----------------------- Francois answer -----------------------------

      // Scanner scan31 = new Scanner(System.in);
      // System.out.println("Input a number");
      // int num = scan31.nextInt();
      // for(int i = 1; i <= 10; i++){
      // System.out.printf("%d * %d = %d%n", num, i, (num * i));
      // }
      // scan31.close();

  //=====================================================================

  /*
   * 4 - Print the Pattern
   * Write a program to display the following pattern.
   * 
   * J    a   v     v  a
   * J   a a   v   v  a a
   * J  J  aaaaa   V V  aaaaa
   * JJ  a     a   V  a     a
   * Note: Use Print Formatting
  */

  System.out.printf("%n%4s%5s%4s%6s%3s%n","J","a","v","v","a");
  System.out.printf("%4s%4s%2s%4s%4s%3s%2s%n","J","a","a","v","v","a","a");
  System.out.printf("%1s%3s%7s%4s%2s%7s%n","J","J","aaaaa","v","v","aaaaa");
  System.out.printf("%3s%3s%6s%4s%3s%6s%n%n","JJ","a","a","v","a","a");

//----------------------- Francois answer -----------------------------

    // System.out.printf(
    //        "%1$4s%2$5s%3$4s%3$6s%4$3s%n%1$4s%2$4s%2$2s%3$4s%3$4s%4$3s%4$2s%n%1$s%1$3s%2$3s%2$s%2$s%2$s%2$s%3$4S%3$2S%4$3s%4$s%4$s%4$s%4$s%n%1$2s%1$s%2$3s%2$6s%3$4S%4$3s%4$6s%n",
    //        "J", "a", "v", "a");

  }
}
