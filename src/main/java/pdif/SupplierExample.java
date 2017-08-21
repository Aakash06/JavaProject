package pdif;

import java.util.function.Supplier;

class SupplierExample {

    String greetMessage() {

        Supplier<String> supplier = () -> "Welcome to Knoldus!!";
        return supplier.get();
    }

}
