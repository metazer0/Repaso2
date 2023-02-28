import java.util.HashMap;

public class Abbreviations {
    public static void main(String[] args) {
        Abbreviation abbreviations = new Abbreviation();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                System.out.println(part);
                part = abbreviations.findExplanationFor(part);
            }

            System.out.println(part);
//            System.out.print(" ");
        }

        System.out.println();
    }
}

class Abbreviation {

    private HashMap<String,String> hashmap;
    public Abbreviation(){
        this.hashmap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.hashmap.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(this.hashmap.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
       return this.hashmap.get(abbreviation);
    }
}
