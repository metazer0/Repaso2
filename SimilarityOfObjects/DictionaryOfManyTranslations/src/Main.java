import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}

class DictionaryOfManyTranslations{

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation){

        this.dictionary.putIfAbsent(word, new ArrayList<>());

        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        ArrayList<String> translations = new ArrayList<>();
        if(this.dictionary.isEmpty()){
            return translations;
        }else{
            translations = this.dictionary.get(word);
        }
        return translations;
    }

    public void remove(String word){
        ArrayList<String> removed = this.dictionary.get(word);
        this.dictionary.remove(word,removed);
        this.dictionary.remove(word);
    }
}