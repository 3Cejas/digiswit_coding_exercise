public class digiswit_coding_exercise {

    /* In Java, method overriding occurs when a subclass or child class defines a method
    that has the same name and signature as a method defined in the parent class. The
    subclass method is said to override the parent class method.
    Here is an example of method overriding in Java: */

    class Animal {
        public void makeSound() {
          System.out.println("Some generic animal sound");
        }
      }
      
      class Dog extends Animal {
        @Override
        public void makeSound() {
          System.out.println("Bark");
        }
      }

    /* In this example, the makeSound method is defined in the Animal class and is then 
    overridden in the Dog class. When the makeSound method is called on an instance of the
    Dog class, it will execute the code in the Dog class version of the makeSound method,
    rather than the version defined in the Animal class.

    There are some rules to follow when overriding methods in Java:
        - The subclass method must have the same name and signature as the parent class method.
        - The subclass method must be at least as accessible or more accessible than the parent 
          class method. For example, you cannot override a public method with a private method.
        - The subclass method must not throw new or broader checked exceptions.
        - If the parent class method is marked with the final keyword, it cannot be overridden.
        - If the parent class method is marked with the static keyword, it cannot be overridden, but it can be hidden. */

    // Auxiliary function that, given a list of integers, returns the second largest integer.
    static int second_larguest_number(int[] array) {
        if (array.length <= 1) {
          System.out.println("The length of the array is too short: " + array.length);
          throw new IllegalArgumentException("Invalid array length");
        }
        int count = 2;
        int larguest;
        int second_larguest;
        if(array[0] >= array[1]) {
            larguest = array[0];
            second_larguest = array[1];
        }
        else{
            larguest = array[1];
            second_larguest = array[0];
        }
        while(count < array.length && array.length != 2) {
            if(array[count] > larguest) {
                second_larguest = larguest;
                larguest = array[count];
            }
            else if (array[count] > second_larguest) {
                second_larguest = array[count];
            }
            count++;
        }
        return second_larguest;
    }

    // Auxiliary function that, given a natural number, returns its Fibonacci term.
    static int fibonacci_numbers(int n) {
        if (n < 0) {
            System.out.println("The number has to be positive: " + n);
            throw new IllegalArgumentException("Invalid number");
          }
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonacci_numbers(n-1) + fibonacci_numbers(n-2);
        }
    }

    // Auxiliary function that, given a natural number, returns the Fibonacci series of that number.
    static void fibonacci_series(int n) {
        int count = 1;
        while(count < n) {
            System.out.println("Term " + count + ": "+ fibonacci_numbers(count));
            count ++;
        }
    }
    public static int add(int a, int b) {
        return a + b;
      }
    
      public static int add(int a, int b, int c) {
        return a + b + c;
      }
    
      public static double add(double a, double b) {
        return a + b;
      }
    
    // Main function.
    public static void main(String args[]) {
        int[] example = {5, 3, 9, 10};
        System.out.println("The second larguest number of the list example is: " + second_larguest_number(example));
        System.out.println("----------------------------");
        int number = 30;
        System.out.println("The Fibonacci series of " + number + " is: ");
        fibonacci_series(number);
        System.out.println("----------------------------");

        /* In Java, overloading refers to the ability of a class or method to have multiple definitions,
        each with a different set of parameters. This allows the class or method to perform a variety 
        of tasks, depending on the input it receives.

        Here is an example of method overloading in Java: */
        
        System.out.println("Add: " + add(1, 2));
        System.out.println("Add: " + add(1, 2, 3));
        System.out.println("Add: " + add(1.0, 2.0));

        /* In this example, the add method is overloaded with three different definitions, each with a
        different number and type of parameters. When the add method is called with two integer arguments,
        the first definition is used. When it is called with three integer arguments, the second definition
        is used. And when it is called with two double arguments, the third definition is used. */
    }

}
