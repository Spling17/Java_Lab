package JavaLab5;
/* -------------------------- Q2 --------------------------
・Create an ArrayList of Integers
・Fill the ArrayList with ten random numbers (1-50)
・Copy each value from the ArrayList into another ArrayList of the same capacity
・Change the last value in the first (original) ArrayList to a -5
・Display the contents of both ArrayLists */

import java.util.*;

public class Lab5Q2 {
  public static void main(String[] args) {

    Random r = new Random();

    //Create an ArrayList of Integers
    ArrayList<Integer> list = new ArrayList<Integer>();
    //Fill the ArrayList with ten random numbers (1-50)
    for (int i = 0; i < 10; i++) {
      list.add(1 + r.nextInt(50));
    }
    System.out.println("ArrayList: " + list);
    System.out.println("----------------------------------------------------------");

    //Copy each value from the ArrayList into another ArrayList of the same capacity
    ArrayList<Integer> copyList = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      copyList.add(list.get(i));
    }

    //Change the last value in the first (original) ArrayList to a -5
    //List.set((場所)index, (変えたい値)Chenge Value);
    list.set(9, -5);

    //Display the contents of both ArrayLists */
    System.out.println("ArrayList: " + list);
    System.out.println("ArrayList: " + copyList);

  }

}
