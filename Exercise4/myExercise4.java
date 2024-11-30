// package Exercise4;

class Library {
    String availableBook[] = { "book1", "book2", "book3", "book4" };
    String issuedBook[] = new String[Integer.MAX_VALUE - 1];
    // String issuedBook[] = new String[5];

    public void addBook(String name) {
        int getLength = availableBook.length;
        availableBook[getLength] = name;
    }

    public void issued(String name) {
        int getLength = issuedBook.length;
        // issuedBook[0] = name;
        System.out.println(issuedBook.length);

    }

    public void availableAllBook() {
        for (String value : availableBook) {
            System.out.println(value);
        }
    }

    public void seeAllIssuedBook() {
        for (String value : issuedBook) {
            System.out.println(value);
        }
    }
}

public class myExercise4 {
    public static void main(String args[]) {
        Library library1 = new Library();
        library1.availableAllBook();
        library1.issued("book4");
        // library1.seeAllIssuedBook();
    }
}
