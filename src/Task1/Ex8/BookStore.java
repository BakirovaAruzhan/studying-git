package Task1.Ex8;

import Task1.Ex8.Book1;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Book1[] books = new Book1[N];

        for (int i = 0; i < N; i++) {
            books[i] = new Book1();
            books[i].title = scanner.next();
            books[i].price = scanner.nextInt();
            books[i].type = scanner.next();
            books[i].sold = scanner.nextInt();
        }

        int totalRevenue = 0;

        for (int i = 0; i < N; i++) {
            int revenue;

            if (i < 50) {
                if ("Classical".equals(books[i].type)) {
                    revenue = (int) (books[i].price * 0.8 * books[i].sold);
                } else {
                    revenue = (int) (books[i].price * 0.8 * books[i].sold);
                }
            } else {
                if ("Classical".equals(books[i].type)) {
                    revenue = (int) (books[i].price * 0.8 * books[i].sold);
                } else {
                    revenue = (int) (books[i].price * 1.2 * books[i].sold);
                }
            }

            totalRevenue += revenue;
            System.out.println(books[i].title + " " + revenue);
        }

        System.out.println("Total = " + totalRevenue);
    }
}