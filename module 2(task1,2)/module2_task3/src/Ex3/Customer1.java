package Ex3;

public class Customer1 {
    private int id;
    private String name;
    private Gender gender;

    public Customer1(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;

    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void  setDiscount(double discount){
        this.d;
    }

    public Gender getGender(){
        return gender;
    }
    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }




}
