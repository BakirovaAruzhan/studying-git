package Ex3;

import Ex4.Gender;

public class Customer2 {
    private int id;
    private String name;
    private Gender gender;
    private int discount;

    public Customer2(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public Gender getGender(){
        return gender;

    }

    public String toString(){
        return name+" "+id;
    }


}
