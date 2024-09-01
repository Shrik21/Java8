package lambda;

// Define the Greeting interface with a single abstract method sayHello
interface Greeting {
    void sayHello();
}

public class LambdaVsAnonymousClass {
    public static void main(String[] args) {
        // Anonymous inner class implementation of the Greeting interface
        // This creates an instance of an anonymous class that implements the sayHello method
        Greeting anonymousClassGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class!");
            }
        };

        // Lambda expression implementation of the Greeting interface
        // This creates an instance of a lambda expression that implements the sayHello method
        Greeting lambdaGreeting = () -> System.out.println("Hello from lambda expression!");

        // Call the sayHello method for the anonymous inner class implementation
        anonymousClassGreeting.sayHello();

        // Call the sayHello method for the lambda expression implementation
        lambdaGreeting.sayHello();
    }
}