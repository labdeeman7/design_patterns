package lab9.homework;

public class ModernLibraryBook implements Book {
    private String author;
    private String title;
    private String location;

    public ModernLibraryBook(String author, String title, String location){
        this.author = author;
        this.title = title;
        this.location = location;
    }

    public String getTitle() {
         return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getLocation() {
        return location;
    }
}
