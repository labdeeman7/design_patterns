package lab9.homework;

public class PaperIndexCardAdapter implements Book {

    private String legacyIndexCard;

    PaperIndexCardAdapter(String legacyIndexCard){
        this.legacyIndexCard = legacyIndexCard;
    }

    public String getAuthor() {
        String[] bookInformation = legacyIndexCard.split("\\|");
        return bookInformation[0];
    }

    public String getTitle() {
       String[] bookInformation = legacyIndexCard.split("\\|");
       return bookInformation[1];
    }

    public String getLocation() {
        String[] bookInformation = legacyIndexCard.split("\\|");
        return bookInformation[2];
    }
}
