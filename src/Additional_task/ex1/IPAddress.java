package Additional_task.ex1;
public class IPAddress {
    public static String IPAddress(String address) {
        return address.replaceAll("\\.", "[.]");
    }
    public static void main(String[] args) {
        String address1 = "1.1.1.1";
        String defanged1 = IPAddress(address1);
        System.out.println("Исходный: " + address1);
        System.out.println("Дефангированный: " + defanged1);

        String address2 = "255.100.50.0";
        String defanged2 = IPAddress(address2);
        System.out.println("Исходный: " + address2);
        System.out.println("Дефангированный: " + defanged2);
    }
}

