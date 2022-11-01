// # Lab Exercise 2
// ##### Organize your answers in separate files and push them to a git repository. Submit the github repository link via Google Classroom.

// > Example: Exercise1.java, Exercise2.java, etc...

import java.util.Scanner;
public class JavaLab2 {
  public static void main(String[] args) {

// ############ Exercise 1 — Run of Integers ############

// Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) between those two values.

// Scanner scan1 = new Scanner(System.in);
// Scanner scan11 = new Scanner(System.in);

//     int inputStart;
//     System.out.println("Input the Start:");
//     inputStart = scan1.nextInt();

//     int inputEnd;
//     System.out.println("Input the Start:");
//     inputEnd = scan1.nextInt();
    
//     for(int i = inputStart; i <= inputEnd; i++){
//       System.out.println(i);
//     }
    
// scan1.close();
// scan11.close();

//-----------------------------------------------------------------

// Scanner scan12 = new Scanner(System.in);

//     int inputStart2;
//     System.out.println("Input the Start:");
//     inputStart2 = scan12.nextInt();

//     int inputEnd2;
//     System.out.println("Input the Start:");
//     inputEnd2 = scan12.nextInt();
  
//     for(int i = inputStart2; i <= inputEnd2; i++){
//       System.out.println(i);
//     }
    
// scan12.close();

//----------------------- Francois Answer --------------------------





// ############ Exercise 2 — Sum of sequential integers ############

// Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.

// Scanner scan2 = new Scanner(System.in);

//     int inputN;
//     System.out.println("Input the N:");
//     inputN = scan2.nextInt();
//     int sum = 0;
    
//     for(int i = 1; i <= inputN; i++){   
//       sum += i;
//     }
//     System.out.println("The sum of 1 to " + inputN + " is " + sum);
  
// scan2.close();

//----------------------- Francois Answer --------------------------

// ############ Exercise 3 - Word Echo ############

// Write a program that asks the user to enter a word. The program will then repeat the word for as many times as its characters:

// Scanner scan3 = new Scanner(System.in);

//     String enterWord;
//     System.out.println("Enter a word:");
//     enterWord = scan3.nextLine();
    
//     for(int i = 1; i <= enterWord.length(); i++){   
//       System.out.println(enterWord);
//     }
    
// scan3.close();

//----------------------- Francois Answer --------------------------



// // ############ Exercise 4 - Adding up Integers ############

// Write a program that adds up integers that the user enters. First the programs asks how many numbers will be added up. Then the program prompts the user for each number. Finally it prints the sum.

Scanner scan4 = new Scanner(System.in);

    int countNum;
    int sum4 = 0;

    System.out.println("How many integers will be added?:");
    countNum = scan4.nextInt();
    
    while (countNum > 0) {
      System.out.println("Enter an integer:");
      sum4 += scan4.nextInt();
      countNum--;
    }
    System.out.println("the sum is: " + sum4);
    
scan4.close();

//----------------------- Francois Answer --------------------------
int count, sum41 = 0;
Scanner scan41 = new Scanner(System.in);

    System.out.println("How many integers will be added?:");
    count = scan41.nextInt();
    
    while (count > 0) {
      System.out.println("Enter an integer:");
      sum41 += scan4.nextInt();
      count--;
    }

    System.out.println("the sum is: " + sum41);
    
scan41.close();

  }
}
