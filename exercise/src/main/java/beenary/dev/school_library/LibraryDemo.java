package beenary.dev.school_library;

public class LibraryDemo {

    public static void main(String[] args) {
        Library library = new Library();
        library.checkOutBook();
        int booksNumber = library.getTotalBooksNumber();

        if(booksNumber == 9) {
            System.out.println("Wow. You're doing well.");
        }else{
            System.out.println("Something is wrong with your method.");
        }

        library.returnBook();
        booksNumber = library.getTotalBooksNumber();
        if(booksNumber == 10) {
            System.out.println("Nice work.");
        }else{
            System.out.println("Something is wrong with your method.");
        }

    }
}
