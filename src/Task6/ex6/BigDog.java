package Task6.ex6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("woow");
    }

    public void greets(Dog another){
        System.out.println("wooooooow");
    }

    public void greets(BigDog another){
        System.out.println("woooooooooooooooooooooooooooooooow");
    }


}
