package Module2Tasks.Task4.ex6;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[%s]".formatted(super.toString());
    }
}