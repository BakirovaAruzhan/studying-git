package Module2Tasks.Task4.ex6;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[%s]".formatted(super.toString());
    }
}