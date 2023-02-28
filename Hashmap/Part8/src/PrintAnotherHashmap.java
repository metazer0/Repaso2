import java.util.HashMap;

public class PrintAnotherHashmap {
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));
        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String,Book> hashMap){
        for(Book book : hashMap.values()){
            System.out.println(book.toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book>hashMap, String text){
        for(Book book : hashMap.values()){
            String name = book.getName();
            if(name.contains(text)){
                System.out.println(book.toString());
            }
        }
    }
}

class Book{
    private String name;
    private String contents;
    private int publicationYear;

    public Book(String name, int publicationYear, String contents) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getContents() {
        return this.contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.publicationYear + ")\n"
                + "Contents: " + this.contents;
    }
}
