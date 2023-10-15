public class DataIntroExample {

    /*public class DataIntoExample { declares the start of a Java class named "DataIntoExample." The public keyword means that this class is accessible from other classes. The class name must match the file name (excluding the ".java" extension). */

    public static void main(String[] args){
        /*public static void main(String[] args) is the main method. In a Java program, the main method is the entry point of the program. It's where the program starts its execution. The public keyword indicates that this method can be accessed from outside the class. static means that you can call this method without creating an instance of the class. void means that the method does not return a value. The String[] args parameter allows you to pass command-line arguments to your program. */

    addTwoNumber(1, 2);

    /*addTwoNumber(1, 2); is a method call. It's calling the addTwoNumber method with two integer arguments, 1 and 2. This is how you pass data to a method in Java. */
    }

    public static void addTwoNumber(int number1, int number2){

        /*public static void addTwoNumber(int number1, int number2) is the definition of another method named addTwoNumber. This method is designed to accept two integer parameters: number1 and number2. It is defined as public (accessible from other classes) and static (can be called without creating an instance of the class). */

        System.out.println(number1 + number2);


    }
    

}


