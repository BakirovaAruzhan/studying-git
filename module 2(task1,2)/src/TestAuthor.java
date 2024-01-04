public class TestAuthor {

    public static void main(String[] args) {
        //  Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        //        System.out.println(ahTeck);  // Author's toString()
        //        Book2 dummyBook = new Book2("Java for dummy", Author, 19.95, 99);  // Test Book's Constructor
        //        System.out.println(dummyBook);  // Test Book's toString()
        //
        //// Test Getters and Setters
        //        dummyBook.setPrice(29.95);
        //        dummyBook.setQty(28);
        //        System.out.println("name is: " + dummyBook.getName());
        //        System.out.println("price is: " + dummyBook.getPrice());
        //        System.out.println("qty is: " + dummyBook.getQty());
        //        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        //        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        //        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        //
        //// Use an anonymous instance of Author to construct a Book instance
        //        Book2 anotherBook = new Book2("more Java",
        //                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        //        System.out.println(anotherBook);  // toString()
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        Author[] authors1 = {new Author("John Doe", "john.doe@example.com", 'M')};
        System.out.println(authors1);  // toString()
    }
}

