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
    System.out.println("Hello " + args[0]);
    }
                            


}