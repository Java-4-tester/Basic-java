public class ArrayExample {

    public static void main(String[] args){

        String[] arrayOfName = {"A", "B", "C", "D"};
        int[] number = {12, 2, 8, 3};

        /*arrayOfName is an array of strings, and number is an array of integers. Arrays are used to store multiple values of the same data type. In this case, arrayOfName stores four strings, and number stores four integers. */

        System.out.println(arrayOfName[3]);
        System.out.println(number[0] + number[3]);

        /*arrayOfName[3] accesses the fourth element (index 3) of the arrayOfName array, which is "D." In Java, array indices start from 0, so the first element is at index 0, the second at index 1, and so on.

number[0] + number[3] adds the values of the first element (index 0) and the fourth element (index 3) of the number array. In this case, it adds 12 and 3, resulting in the value 15. */
    }
    
}
