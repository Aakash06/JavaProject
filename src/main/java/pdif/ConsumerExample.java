package pdif;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void greet(Consumer<String> consumer){
        consumer.accept("Hello Moto!!");}

    public static void main(String[] args) {
        Consumer<String> consumer = greetMessage ->  System.out.println(greetMessage);
        greet(consumer);
        consumer.accept("Welcome to Knoldus");
    }
}
