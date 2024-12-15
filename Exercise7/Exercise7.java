// package Exercise7;

import java.util.ArrayList;
import java.util.Scanner;

class LibraryManagement {
    private String BookName;
    private String Author;
    private String userName;
    private String AlreadyIssued;
    private ArrayList<ArrayList<String>> addInfo = new ArrayList<>();
    private ArrayList<String> registerUser = new ArrayList<String>();
    private ArrayList<ArrayList<String>> available_Book_In_Library_With_Author = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBookInLibraryWithAuthor(String bookName, String authorName) {
        ArrayList<String> bookWithAuthor = new ArrayList<String>();
        bookWithAuthor.add(bookName);
        bookWithAuthor.add(authorName);
        available_Book_In_Library_With_Author.add(bookWithAuthor);
    }

    public void addBookDetails() {
        ArrayList<String> al = new ArrayList<String>();

        System.out.print("Enter Book Name :");
        this.BookName = sc.nextLine();
        System.out.print("Enter Author Name :");
        this.Author = sc.nextLine();

        for (int i = 0; i < this.available_Book_In_Library_With_Author.size(); i++) {
            if (this.available_Book_In_Library_With_Author.get(i).contains(this.BookName)
                    && this.available_Book_In_Library_With_Author.get(i).contains(this.Author)) {
                System.out.printf("%s book already present in library with %s Author\n", this.BookName, this.Author);
                return;
            }
        }
        this.AlreadyIssued = "false";
        this.userName = "false";
        al.add(BookName);
        al.add(Author);
        al.add(userName);
        al.add(AlreadyIssued);
        addInfo.add(al);
        addBookInLibraryWithAuthor(this.BookName, this.Author);

    }

    public boolean find_User_already_carry_book(String giveUserName) {
        for (int i = 0; i < this.addInfo.size(); i++) {
            String getUserName = this.addInfo.get(i).get(2);

            if (getUserName.equals(giveUserName)) {
                return true;
            }
        }
        return false;
    }

    public boolean Check_Book_Present_Or_Not(String bookName, String UserName) {
        for (int i = 0; i < addInfo.size(); i++) {
            String getBook = this.addInfo.get(i).get(0);
            String getStatus = this.addInfo.get(i).get(3);
            if (getBook.equals(bookName)) {
                if (getStatus.equals("true")) {
                    System.out.println("this book already issued to someOne");
                    return true;
                }
                boolean getResult = find_User_already_carry_book(UserName);
                if (getResult) {
                    System.out.printf(" alreay issued to %s\n", UserName);
                    return true;
                } else {
                    this.addInfo.get(i).set(2, UserName);
                    this.addInfo.get(i).set(3, "true");
                    System.out.printf("issued %s book to %s\n", bookName, UserName);
                    return true;
                }
            }
        }
        return false;
    }

    public void issuedBookToUser() {
        System.out.println("Enter Your Name :");
        String UserName = sc.nextLine();
        // System.out.println();
        // sc.nextLine();
        String bookName = "";
        if (!registerUser.contains(UserName)) {
            System.out.print("Want to Register true/false :");
            boolean userWantToRegister = sc.nextBoolean();
            sc.nextLine();
            if (userWantToRegister) {
                this.WantRegister(UserName);
                this.printBookDetails();
                System.out.print("Enter BookName :");
                bookName = sc.nextLine();
            } else {
                System.out.println("You need to register first.");
                return;
            }
        } else {
            this.printBookDetails();
            System.out.print("Enter BookName :");
            bookName = sc.nextLine();
        }

        boolean getResult = Check_Book_Present_Or_Not(bookName, UserName);
        if (!getResult) {
            System.out.println("book not present in library");
        }

    }

    public void WantRegister(String userName) {
        Boolean CheckUserIsExist = false;
        for (int i = 0; i < this.registerUser.size(); i++) {
            if (this.registerUser.get(i) == userName) {
                CheckUserIsExist = true;
            }
        }
        if (CheckUserIsExist) {
            System.out.println("user already Register");
        } else {
            registerUser.add(userName);
            System.out.println("register user successfully");
        }
    }

    // ************************************************* return process

    public void wantToReturn() {
        boolean status = false;
        System.out.print("enter your Name :");
        String userName = sc.nextLine();
        for (int i = 0; i < addInfo.size(); i++) {
            String findInLibrary = addInfo.get(i).get(2);
            if (findInLibrary.equals(userName)) {
                System.out.println(addInfo.get(i));
                System.out.print("want to return true/false:");
                boolean myStatus = sc.nextBoolean();
                if (myStatus) {
                    addInfo.get(i).set(2, "false");
                    addInfo.get(i).set(3, "false");
                    status = true;

                } else {
                    System.err.println("ok");
                }
                break;
            }

        }

        if (status) {
            System.out.println("return book");
        } else {
            System.out.println("this use is not present");
        }

    }

    public void printBookDetails() {
        for (int i = 0; i < this.available_Book_In_Library_With_Author.size(); i++) {
            System.out.print(this.available_Book_In_Library_With_Author.get(i) + " ");
        }
        System.out.println();
    }

    public void printBookfullDetails() {
        int getSize = this.addInfo.size();
        if (getSize > 0) {
            for (int i = 0; i < this.addInfo.size(); i++) {
                System.out.println(this.addInfo.get(i));
            }

        } else {
            System.out.println("not data present, so add first");
        }
    }
}

public class Exercise7 {
    public static void main(String args[]) {
        LibraryManagement lb = new LibraryManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Choose One add/issued/return/userInfo/exit :");
            String whatDesire = sc.next();
            if (whatDesire.equals("add")) {
                lb.addBookDetails();

            } else if (whatDesire.equals("issued")) {
                lb.issuedBookToUser();

            } else if (whatDesire.equals("return")) {
                lb.wantToReturn();
            } else if (whatDesire.equals("userInfo")) {
                lb.printBookfullDetails();
            } else if (whatDesire.equals("exit")) {
                break;
            }

        }

    }
}
