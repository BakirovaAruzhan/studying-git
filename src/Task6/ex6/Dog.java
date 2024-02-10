package Task6.ex6;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    @Override
    public void greets( Dog another) {
        System.out.println("Woof Woof");
    }
}
