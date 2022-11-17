package JavaLab6;
/*
 * # Lab 6: Finding Max in an Array
 * 
 * Define a Generic Class type method called `array_max` that will generalize
 * the method such that
 * it finds maximum value for both `int` and `double` type array input values.
 * Your generic class type array_max method code should find the maximum element
 * in an array using generics.
 * 
 * Method will take the array and array size as parameters.
 */

public class JavaLab6 {
    public static void main(String[] arg)throws Exception{

        FindMax findMax = new FindMax();
        // #### Expected input
        // Input 1  // If input is:
        Integer arr_i[] = {2,8,20,3,4};
        int arr_i_size = arr_i.length;
        System.out.println("Max array: " + findMax.array_max(arr_i, arr_i_size));
        
        //Input 2. //If input is 
        Double arr_d[] = {2.7,3.8,5.5,6.7,9.7};
        int arr_d_size = arr_d.length;
        System.out.println("Max array: " + findMax.array_max(arr_d, arr_d_size));
    }
}

    class FindMax {
        public static <T extends Comparable<T>> T array_max(T data[], int n) {
            T max = data[0];

            for(int i =1; i < n-1 ; i++){
                if(data[i+1].compareTo(max) > 0){
                    max = data[i+1];
                }
            }
            return max;
        }
    }

    // class FindMax {
    //     public static Integer array_max(Integer data[], int n) {
    //         // body of code
    //         return 0;
    //     }
    
    //     public static Double array_max(Double data[], int n) {
    //         // body of code
    //         return 0.0;
    //     }
    // }

//     //Expected output 1
//     20


// //Expected output 2
// 9.7

// #### Sample code with none generic

