package lab9.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ModernLibraryBook>  modernDatabase = new ArrayList<>();
        ArrayList<String> paperIndexCardDatabase = new ArrayList<>();

        //Adding books to modern Database
        modernDatabase.add( new ModernLibraryBook("Chimamanda Adichie",
                "Half of a Yellow Sun", "Shelf 1") );
        modernDatabase.add( new ModernLibraryBook("Neil Gaiman",
                "American Gods", "Shelf 2") );

        //adding books to paper Index Database
        paperIndexCardDatabase.add( "Chinua Achebe|Things Fall Apart|Shelf 3");
        paperIndexCardDatabase.add( "J. R tolkien|The hobbit|Shelf 4");

        //Create adapter database
        ArrayList<PaperIndexCardAdapter>  paperIndexCardAdapterDatabase = new ArrayList<>();
        for (String indexCard : paperIndexCardDatabase) {
            paperIndexCardAdapterDatabase.add( new PaperIndexCardAdapter(indexCard));
        }

        //Combine both modern and adapter databases.
        ArrayList<Book> combinedDatabase = new ArrayList<>();
        combinedDatabase.addAll(modernDatabase);
        combinedDatabase.addAll(paperIndexCardAdapterDatabase);

        //Perform search on combined database
        //Search by name
//        String name = "Chinua Achebe";
//        for (Book book : combinedDatabase) {
//            String bookName = book.getAuthor();
//            if (bookName.equals(name)){
//                System.out.println("book found. book at   \n" + book.getLocation());
//            }
//            else{
//                System.out.println("book not found");
//            }
//        }

        //Search by Name
        //book from old card index
        String name1 = "Chinua Achebe";
        searchByAuthor(name1, combinedDatabase);
        //book from modern database
        String name2 = "Neil Gaiman";
        searchByAuthor(name2, combinedDatabase);
        //non existent name
        String name3 = "Rudolf Kalmann";
        searchByAuthor(name3, combinedDatabase);

        //Search by title
        //book from old card index
        String title1 = "Things Fall Apart";
        searchByTitle(title1, combinedDatabase);
        //book from modern database
        String title2 = "American Gods";
        searchByTitle(title2, combinedDatabase);
        //non existent name
        String title3 = "Modern Robotics";
        searchByTitle(title3, combinedDatabase);

    }
    public static void searchByAuthor(String authorName, ArrayList<Book> combinedDatabase){
        for (Book book : combinedDatabase) {
            String bookName = book.getAuthor();
            if (bookName.equals(authorName)) {
                System.out.println( "book written by author: "  + authorName +
                        " found. book at  " + book.getLocation());
                return;
            }
        }
        System.out.println("book written by author " + authorName + " not found");
    }
    public static void searchByTitle(String title, ArrayList<Book> combinedDatabase){
        for (Book book : combinedDatabase) {
            String bookTitle = book.getTitle();
            if (bookTitle.equals(title)) {
                System.out.println("book Title: " + title +  " found. book at  " + book.getLocation());
                return;
            }
        }
        System.out.println("book with title: " + title + " not found");
    }
}
