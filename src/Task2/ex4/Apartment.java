package Task2.ex4;

public class Apartment {
    String title;
    int smet;
    String type;

    public Apartment(String title, int smet, String type) {
        this.title = title;
        this.smet = smet;
        this.type = type;
    }

    public double calculatePrice(int smetPrice) {
        double basePrise = smetPrice * smet;
        if ("Cyberbricks".equals(type)) {
            return basePrise * 1.5;
        } else if ("Carbonpanel".equals(type)) {
            return basePrise*0.8;
        }else return basePrise;

    }
}
