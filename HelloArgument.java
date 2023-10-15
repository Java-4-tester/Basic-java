public class HelloArgument {

    /*
     * public is another access modifier
     * Class is used to define a class
     * HelloArguments is the name of the class
     */

    public static void main(String[] args) {
                                /*static means, the method main belongs to the class itself, not to any specific instance of the class.
                                 * void is the return type of the main method, indicating that it doesn't return any value.
                                 * main is the name of the method. In Java, the main method is the starting point of a program.
                                 * (String[] args) is the parameter list for the main method
                                  */
    System.out.println("Hello " + args[0] + args[2]);

                                /*System.out is an object that represents the standard output stream, used to print data to the console.
                                println: This is a method of the System.out object, used to print a string.
                                "Hello " + args[0]) is the argument, the args array contains command-line arguments passed to the program.
                                  */
    }
                            


}